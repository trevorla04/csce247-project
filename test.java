import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        // Create users for testing
        User user1 = new User("john_doe", "john@example.com", "password123");
        User user2 = new User("jane_smith", "jane@example.com", "securepassword");
        User user3 = new User("alice_wonder", "alice@example.com", "alice1234");

        // Add users to the UserList
        UserList userList = UserList.getInstance();
        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user3);

        // Test saving users to JSON file
        DataWriter.saveUsers();
        System.out.println("Users were successfully written to JSON file.");

        // Clear current UserList to simulate a fresh load
        userList.clear();

        // Test loading users from JSON file
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
}
