package library;

import com.backend.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

// Written by Trevor
public class DataLoaderTests {
    private UserList users = UserList.getInstance();
    private ArrayList<User> userList = users.getAllUsers();

    @BeforeEach void setup() {
        userList.clear();
        userList.add(new User("jsmith", "jsmith@gmail.com", "password"));
        userList.add(new User("john", "john@gmail.com", "password1"));
        DataWriter.saveUsers();
    }

    @AfterEach
    public void tearDown() {
        users.getInstance().getAllUsers().clear();
        DataWriter.saveUsers();
    }

    @Test
    void testGetUsersSize() {
        userList = DataLoader.loadUsers();
        assertEquals(2, userList.size());
    }

    @Test
    void testGetUsersSizeZero() {
        users.getInstance().getAllUsers().clear();
        DataWriter.saveUsers();
        assertEquals(0, userList.size());
    }

    @Test
    void testGetUserFirstUserName() {
        userList = DataLoader.loadUsers();
        assertEquals("jsmith", userList.get(0).getUsername());
    }
}
