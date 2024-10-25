import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * The UserList class is a singleton that manages a list of User objects. 
 * It provides methods to add, retrieve, and save/load users from a file.
 */
public class UserList 
{
    /** The single instance of UserList (Singleton). */
    private static UserList userList;

    /** The list of User objects. */
    private ArrayList<User> users;

    /**
     * Private constructor to initialize an empty list of users.
     */
    private UserList()
    {
        users = new ArrayList<>();
    }

    /**
     * Returns the single instance of the UserList.
     *
     * @return the instance of UserList
     */
    public static UserList getInstance ()
    {
        if (userList == null) 
        {
            userList = new UserList();
        }
        return userList;
    }

    /**
     * Retrieves a User by their username.
     *
     * @param s the username to search for
     * @return the User with the matching username, or null if not found
     */
    public User getUser (String s)
    {
        for (User user : users) 
        {
            if (user.getUsername().equalsIgnoreCase(s))
            {
                return user;
            }
        }
        return null;
    }

    /**
     * Adds a User to the list.
     *
     * @param user the User to be added
     */
    public void addUser(User user) {
        users.add(user);
    }

    /**
     * Returns the list of all users.
     *
     * @return an ArrayList of all User objects
     */
    public ArrayList<User> getAllUsers() {
        return users;
    }

    /**
     * Checks if the list contains a specific User.
     *
     * @param user the User to check for
     * @return true if the User is in the list, false otherwise
     */
    public boolean containsUser(User user) {
        return users.contains(user);
    }

    /**
     * Clears the list of all users.
     */
    public void clear() {
        users.clear();
    }

    /**
     * Saves the list of users to a file named "users.dat".
     * If an error occurs during the process, it prints the stack trace.
     */
    public void saveUsers ()
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users.dat"))) 
        {
            oos.writeObject(users);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    /**
     * Loads the list of users from a file named "users.dat".
     * If an error occurs during the process, it prints the stack trace.
     */
    public void loadUsers ()
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users.dat"))) 
        {
            users = (ArrayList<User>) ois.readObject();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
