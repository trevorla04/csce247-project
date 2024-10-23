package com.backend;

public class test {

    public static void main(String[] args) {
        // Testing DataLoader & DataWriter
        User user1 = new User("john_doe", "john@example.com", "password123");
        User user2 = new User("jane_smith", "jane@example.com", "securepassword");
        User user3 = new User("alice_wonder", "alice@example.com", "alice1234");
        User user4 = new User("trevor", "trevor@example.com", "trevor1234");

        UserList userList = UserList.getInstance();
        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user3);

        DataWriter.saveUsers();
        System.out.println("Users were successfully written to JSON file.");

        userList.clear();

        UserList loadedUsers = DataLoader.loadUsers();
        if (loadedUsers != null) {
            System.out.println("Users were successfully loaded from JSON file.");
            for (User user : loadedUsers.getAllUsers()) {
                System.out.println("Username: " + user.getUsername() + ", Email: " + user.getEmail() + ", UUID: " + user.getUUID());
            }
        } else {
            System.out.println("Failed to load users from JSON file.");
        }

        // Testing valid login
        System.out.println("Testing user1's valid login: " + user1.validLogin("john@example.com",
                "password123"));

        // Testing valid add user
        System.out.println("Testing adding a valid user: " + loadedUsers.getAllUsers().contains(user1));

        // Testing invalid login
        System.out.println("Testing an invalid login for user1: " + user1.validLogin("john@example.com",
                "password"));

        // Testing invalid add user
        System.out.println("Testing adding an invalid user: " + loadedUsers.getAllUsers().contains(user4));

    }

}
