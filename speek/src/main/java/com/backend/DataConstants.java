package speek.src.main.java.com.backend;

import java.util.*;
public class DataConstants
{
    protected static final String USER_FILE_NAME = (System.getProperty("os.name").equals("Linux") 
    ? "./demo/src/main/java/data/user.json"
    : ".\\demo\\src\\main\\java\\data\\user.json");
    protected static final String USER_USERNAME = "username";
    protected static final String USER_PASSWORD = "password";
    protected static final String USER_EMAIL = "email";
    protected static final String USER_BIO = "bio";
    protected static final UUID USER_UUID = UUID.randomUUID();
}
