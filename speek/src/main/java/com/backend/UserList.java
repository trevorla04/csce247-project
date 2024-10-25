package com.backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class UserList {
    private ArrayList<Users> users;
    private static UserList userList;

    // Private constructor to prevent instantiation outside of the singleton pattern
    private UserList() {
        users = Dataloader.loadUsers();
    }

    // Retrieves the single instance of UserList. Creates a new instance if none exists
    public static UserList getInstance ()
    {
        if (userList == null) {
            userList = new UserList();
        }
        return userList;
    }

    // Retrieves a user by their username
    public ArrayList<User> getUser(){
        return users;
    }

    public void saveUsers() {
        DataWriter.saveUsers();
    }

    // Adds a user to the user list
    public boolean addUser(User user) {
        if(user == null) {
            return false;
        }
        else 
        {
            users.add(user);
            saveUser();
        }
        return false;
    }

    // Checks if a user with the specified username exists in the user list
    public boolean containsUser(LoginInfo info) {
        for (User user : users) {
            if(user.getUserLogin().getUsername().equals(info.getUsername()) 
            && user.getUserLogin().getPassword().equals(info.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        userLookup.clear();
    }
}