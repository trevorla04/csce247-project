package com.backend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserList
{
    private static UserList userList;
    private HashMap<String,User> userLookup = new HashMap<String,User>();

    // Private constructor to prevent instantiation outside the singleton pattern
    public UserList() {}

    // Retrieves the single instance of UserList. Creates a new instance if none exists
    public static UserList getInstance ()
    {
        if (userList == null)
        {
            userList = new UserList();
        }
        return userList;
    }

    // Retrieves a user by their username
    public User getUser (String s)
    {
        userLookup.get(s);
        return null;
    }

    // Adds a user to the user list
    public void addUser(User user) {
        userLookup.put(user.username,user);
    }

    public boolean validLogin(String loginUsername, String loginPassword) {
        if (users.containsUser(loginUsername)) {
            if (users.getUser(loginUsername).getPassword().equals(loginPassword)) {
                System.out.println("Successfully logged into: " +loginUsername);
                return true;
            }
            else {
                System.out.println("Invalid username or password.");
                return false;
            }
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }

//    public ArrayList<User> getAllUsers() {
//        return users;
//    }

    // Checks if a user with the specified username exists in the user list
    public boolean containsUser(String username){
        return userLookup.containsKey(username);
    }

    // Checks if a user with the specified username exists in the user list
    public boolean containsUser(User user) {
        return userLookup.containsKey(user.username);
    }

    public void clear() {
        userLookup.clear();
    }

    // this should be handled by the DataWriter class
//    public void saveUsers ()
//    {
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users.dat")))
//        {
//            oos.writeObject(users);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//    }

    // And this by the data writer class;
//    public void loadUsers ()
//    {
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users.dat")))
//        {
//            users = (ArrayList<User>) ois.readObject();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
}