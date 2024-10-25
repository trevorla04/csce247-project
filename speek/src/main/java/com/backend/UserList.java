package com.backend;

import java.util.ArrayList;
import java.util.List;

public class UserList 
{
    private static UserList users;
    private List<User> userList;

    // Private constructor to prevent instantiation outside of the singleton pattern
    public UserList() {
        users = DataLoader.loadUsers();
    }

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