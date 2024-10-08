public class DataConstants 
{
    protected static final String USER_FILE_NAME = (System.getProperty("os.name").equals("Linux")
    ? "./demo/src/main/java/data/user.json"
    : ".\\demo\\src\\main\\java\\data\\user.json");
    protected static final String USER = "user";
    protected static final String USER_ID = "user-id";
    protected static final String USER_FIRST_NAME = "first-name";
    protected static final String USER_LAST_NAME = "last-name";
    protected static final String USER_USERNAME = "user-name";
    protected static final String USER_PASSWORD = "password";
    protected static final String USER_EMAIL = "email";
    protected static final String USER_PHONE_NUMBER = "phone-number";
    protected static final String USER_TYPE = "type";
}
