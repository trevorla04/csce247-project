package library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.backend.*;
import java.util.List;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

// Tested by John
public class UserListTests {

    private UserList userList;
    private User user1;
    private User user2;

    @BeforeEach
    void setUp() {
        userList = UserList.getInstance();
        userList.clear();

        // Create some users for testing
        user1 = new User("johncicala", "john@gmail.com", "password123", UUID.randomUUID());
        user2 = new User("bobsmith", "bob@gmail.com", "password123", UUID.randomUUID());
    }

    @Test
    void testSingletonInstance() {
        UserList anotherInstance = UserList.getInstance();
        assertSame(userList, anotherInstance, "UserList should be a singleton.");
    }

    @Test
    void testAddAndRetrieveUser() {
        userList.addUser(user1);
        userList.addUser(user2);

        assertEquals(user1, userList.getUser("johncicala"), "Should retrieve user1 by username.");
        assertEquals(user2, userList.getUser("bobsmith"), "Should retrieve user2 by username.");
    }

    @Test
    void testValidLogin() {
        userList.addUser(user1);

        assertTrue(userList.validLogin("johncicala", "password123"), "Login should be valid for johncicala.");
        assertFalse(userList.validLogin("johncicala", "somewrongpassword"), "Login should be invalid with wrong password.");
        assertFalse(userList.validLogin("johncicalaaaaaaaaa", "password123"), "Login should be invalid for nonexistent username.");
    }

    @Test
    void testGetAllUsers() {
        userList.addUser(user1);
        userList.addUser(user2);

        List<User> allUsers = userList.getAllUsers();
        assertEquals(2, allUsers.size(), "getAllUsers should return 2 users.");
    }

    @Test
    void testContainsUserByUsername() {
        userList.addUser(user1);

        assertTrue(userList.containsUser("johncicala"), "UserList should contain user1 by username.");
        assertFalse(userList.containsUser("blahblahblah"), "UserList should not contain nonexistent username.");
    }

    @Test
    void testContainsUserByUserObject() {
        userList.addUser(user1);

        assertTrue(userList.containsUser(user1), "UserList should contain user1 object.");
        assertFalse(userList.containsUser(user2), "UserList should not contain user2 object (not added).");
    }

    @Test
    void testClear() {
        userList.addUser(user1);
        userList.addUser(user2);

        userList.clear();
        assertTrue(userList.getAllUsers().isEmpty(), "UserList should be empty after clear.");
    }
}