import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        // Create users for testing
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("john_doe", "john@example.com", "password123"));
        testUsers.add(new User("jane_smith", "jane@example.com", "securepassword"));
        testUsers.add(new User("alice_wonder", "alice@example.com", "alice1234"));

        // Test writing users to JSON file
        DataWriter dataWriter = new DataWriter();
        boolean writeSuccess = dataWriter.writeUsersToJson(testUsers);
        if (writeSuccess) {
            System.out.println("Users were successfully written to JSON file.");
        } else {
            System.out.println("Failed to write users to JSON file.");
        }

        // Test loading users from JSON file
        UserList loadedUsers = DataLoader.loadUsers();
        if (loadedUsers != null) {
            System.out.println("Users were successfully loaded from JSON file.");
            for (User user : loadedUsers.getInstance().getUsers()) {
                System.out.println("Username: " + user.getUsername() + ", Email: " + user.getEamil() + ", Bio: " + user.getBio());
            }
        } else {
            System.out.println("Failed to load users from JSON file.");
        }
    }
}
