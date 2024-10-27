package com.backend;

import java.util.ArrayList;
import java.util.List;

public class UserList 
{
    private static UserList users;
    private ArrayList<User> userList = new ArrayList<>();

    // Private constructor to prevent instantiation outside of the singleton pattern
    private UserList() {}

    // Retrieves the single instance of UserList. Creates a new instance if none exists
    public static UserList getInstance ()
    {
        if (users == null)
        {
            users = new UserList();
        }
        return users;
    }

    // Retrieves a user by their username
    public User getUser (String s)
    {
        for (User user : userList) {
            if (user.getUsername().equalsIgnoreCase(s))
                return user;
        }
        return null;
    }

    // Adds a user to the user list
    public void addUser(User user) {
        if (!userList.contains(user))
            userList.add(user);
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public boolean validLogin(String loginUsername, String loginPassword) {
        if (!users.containsUser(loginUsername)) {
            if (users.getUser(loginUsername).getPassword().equals(loginPassword))
                return true;
            else
                return false;
        } else
            return false;

    }

    /**
     * Creates a new account for the user.
     */
    public boolean createAccount(String username, String email, String password) {
        if(users.containsUser(username)){
            System.out.println("User with this username already exists.");
            return false;
        }
        User newUser = new User(username, email, password);
        users.addUser(newUser);
        System.out.println("New user created with username: " + newUser.getUsername());
        return true;
    }

    // Checks if a user with the specified username exists in the user list
    public boolean containsUser(String username){
        if(getUser(username).getUsername().equalsIgnoreCase(username))
            return true;
        else
            return false;
    }

    public void clear() {
        userList.clear();
    }
}