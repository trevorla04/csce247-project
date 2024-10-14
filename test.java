import java.util.ArrayList;
import java.util.UUID;

public class test {
    public static void main(String[] args) {
        // Load users from the JSON file
        UserList users = DataLoader.loadUsers();

        // Check if users were loaded successfully
        if (users != null) {
            System.out.println("Loaded Users:");
            for (User user : users.getAllUsers()) {
                System.out.println(user); // Assuming User has a toString() method
            }
        } else {
            System.out.println("No users were loaded.");
        }
    }
}
