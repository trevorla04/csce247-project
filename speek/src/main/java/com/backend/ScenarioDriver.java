package com.backend;

import java.util.Scanner;

public class ScenarioDriver {
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        LanguageApplication app = new LanguageApplication(DataLoader.loadUsers(), DataLoader.loadLanguages());
        System.out.println("Welcome to Language Learning App");
        printLoginOptions();
        int choice = keyboard.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter username");
                String username = keyboard.nextLine();
                System.out.println("Enter password");
                String password = keyboard.nextLine();
                if (app.login(username, password)) {
                    System.out.println("Successfully logged into: " + username);
                    app.currentUser = app.userList.getUser(username);
                }
                break;
            case 2:
                System.out.println("Enter email address");
                String emailAddress = keyboard.nextLine();
                String newUsername = keyboard.nextLine();
                System.out.println("Enter password");
                String newPassword = keyboard.nextLine();
                app.createAccount(emailAddress, newUsername, newPassword);
            case 3:
                System.exit(0);
        }
        printMenuOptions();
        choice = keyboard.nextInt();
        switch (choice) {
            case 1:
                System.out.println("What language would you like to learn?");
                if (!keyboard.nextLine().equalsIgnoreCase("Spanish"))
                    System.out.println("That language is not supported.");
                else {
                    System.out.println("Loading Spanish language.");
                    break;
                }
            case 9:
                System.exit(0);
        }


    }
    public static void printLoginOptions() {
        System.out.println("1. to login.");
        System.out.println("2. to register an account.");
        System.out.println("9. to exit application.");
    }
    public static void printMenuOptions() {
        System.out.println("1. to a select a language");
        System.out.println("9. to exit application.");
    }
    //public static void
}
