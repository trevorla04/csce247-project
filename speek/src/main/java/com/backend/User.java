package com.backend;

import java.util.List;
import java.util.UUID;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Represents a user in the application.
 * This class contains user information and methods for managing user accounts,
 * including account creation, login validation, friend management, and progress tracking
 */
public class User {

    public String username;  /** The username of the user. */
    private String email;  /** The email address of the user. */
    private String password;  /** The password of the user. */
    public String bio;  /** The bio of the user. */
    private UserList friendsList;  /** The list of friends associated with the user. */
    //public Image profilePicture;  /** The profile picture of the user. */
    private ArrayList<Progress> languageProgress;  /** The progress of the user in various languages. */
    private UUID uuid;  /** The unique identifier for the user. */
    private Language currentLanguage;
    private ArrayList<Lesson> lessonList;


    /**
     * Constructs a new User with the specified username, email, and password.
     * @param username the username of the user
     * @param email the email address of the user
     * @param password the password of the user
     */

    public User(String username, String email, String password, UUID uuid){
        this.username = username;
        this.email = email;
        this.password = password;
        this.uuid = uuid;

    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        //this.friendsList = new UserList();
        this.friendsList = null;
        this.languageProgress = new ArrayList<>();
        this.uuid = UUID.randomUUID();
    }

    /**
     * Creates a new account for the user.
     */
    public static boolean createAccount(String username, String email, String password) {
        if(username == null || email == null || password == null){
            return false;
        }
        if(username.isBlank() || email.isBlank() || password.isBlank()){
            return false;
        }

        UserList userList = UserList.getInstance();

        if(userList.containsUser(username)){
            System.out.println("User with this username already exists.");
            return false;
        }

        User newUser = new User(username, email, password);
        userList.addUser(newUser);
        System.out.println("New user created with username: " + newUser.getUsername());
        return true;
    }

    /**
     * Validates the user's login credentials.
     * @return true if the login is valid; false otherwise
     */


    public boolean validLogin(String loginText, String inputPassword) {
        UserList userList = UserList.getInstance();

        User user = userList.getUser(loginText);
        if (user == null) {
            System.out.println("Invalid login information. User not found.");
            return false;
        }

        // Check if the password matches
        if (user.password.equals(inputPassword)) {
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Incorrect password.");
            return false;
        }
    }

    /**
     * Initiates the password recovery process for the user.
     */
    public void forgotPassword() {
        // Password recovery implementation
    }

    /**
     * Adds a specified user as a friend.
     * @param user the user to be added as a friend
     * @return a message indicating the result of the operation
     */
    public String addFriend(User user) {
        if(friendsList.containsUser(user.getUsername())) {
            return "User is already in your friends list.";
        }
        friendsList.addUser(user);
        return "User added as a friend.";
    }

    /**
     * Refers the user to another user or service.
     * @return a referral message or code
     */
    public String refer() {
        return "Referral code: "+UUID.randomUUID().toString();
    }

    /**
     * Checks the progress of the user in various categories.
     * @return a map of categories to the user's progress
     */
    public HashMap<Category, Integer> checkCategoryProgress() {
        HashMap<Category, Integer> progressMap = new HashMap<>();
        return progressMap;
    }

    /**
     * Checks the progress of the user in various lessons.
     * @return a map of lessons to the user's progress
     */
    public HashMap<Lesson, Integer> checkLessonProgress() {
        HashMap<Lesson, Integer> lessonProgressMap = new HashMap<>();
        return lessonProgressMap;
    }

    public String getUsername() {
        return username;
    }

    /**
     * Saves the user's information to a persistent storage.
     */
    public void saveUser() {
        // User saving implementation
    }

    public String getEmail ()
    {
        return email;
    }

    public String getPassword ()
    {
        return password;
    }

    public String getBio ()
    {
        return bio;
    }

    public UserList getFriendsList ()
    {
        return friendsList;
    }

    public List <Progress> getLanguageProgress ()
    {
        return languageProgress;
    }

    public UUID getUUID ()
    {
        return uuid;
    }


    // This is in users to remove having to clear refrences to stuff when logging out of users.
    public void startNextLesson(){

    }


    public String toString(){


        return "Username: " + username + " Password: " + password + " uuid: " + uuid.toString();
    }

}