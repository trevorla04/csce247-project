package library;

import com.backend.LanguageApplication;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class LanguageApplicationTests {

    public static LanguageApplication languageApplication = new LanguageApplication();

    @BeforeEach
    public void setup(){
        System.out.println("Test");


    }
    @Test
    public void testLogin(){
        languageApplication.login("user1","p@ssw0rd123");
        assertNotNull("User is null", languageApplication.getCurrentUser());
    }
    @Test
    public void testDoubleLogin(){
        languageApplication.login("user1","p@ssw0rd123");
        assertFalse("User should not be able to log in twice", languageApplication.login("user1","p@ssw0rd123"));
    }
    @Test
    public void testInvalidLogin(){
        languageApplication.login("-1","b");
        assertNull("User should not be created", languageApplication.getCurrentUser());
    }
    @Test
    public void testNullLogin(){
        languageApplication.login(null,null);
        assertNull("User should not be created", languageApplication.getCurrentUser());
    }
    @Test
    public void testEmptyLogin(){
        languageApplication.login("","");
        assertNull("User should not be created", languageApplication.getCurrentUser());
    }
    @Test
    public void testCreateUser(){
        assertTrue(languageApplication.createAccount("user123","test","p@ssw0rd123"));
    }
    @Test
    public void testCreateInvalid(){
        assertFalse(languageApplication.createAccount(null,null,null));
    }

    @Test
    public void testCreateBlank(){
        assertFalse(languageApplication.createAccount("","",""));
    }





}
