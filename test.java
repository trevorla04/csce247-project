import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        // Testing DataLoader & DataWriter
        User user1 = new User("john_doe", "john@example.com", "password123");
        User user2 = new User("jane_smith", "jane@example.com", "securepassword");
        User user3 = new User("alice_wonder", "alice@example.com", "alice1234");

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

    }

    public static void testValidLogin() {

    }

    public static void testInvalidLogin() {

    }

    public static void testValidUser() {

    }

    public static void testInvalidUser() {

    }
}
