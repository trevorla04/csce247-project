package com.backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserList 
{
    private static UserList userList;
    private ArrayList<User> users;

    UserList()
    {
        users = new ArrayList<>();
    }

    public static UserList getInstance ()
    {
        if (userList == null) 
        {
            userList = new UserList();
        }
        return userList;
    }

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

    public void addUser(User user) {
        users.add(user);
    }

    public ArrayList<User> getAllUsers() {
        return users;
    }

    public boolean containsUser(User user) {
        return users.contains(user);
    }

    public void clear() {
        users.clear();
    }

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