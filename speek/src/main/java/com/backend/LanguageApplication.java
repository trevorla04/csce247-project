package com.backend;

import java.util.List;

public class LanguageApplication {
    // Private attributes for managing user, language, and application data
    public UserList userList = UserList.getInstance();         // List of users in the application
    public User currentUser;          // The currently logged-in user
    private Language currentLanguage;  // The currently selected language
    private Dictionary dictionary;     // The dictionary associated with the current language
    private List<Lesson> lessonList;   // List of lessons available in the current language
    private Lesson currentLesson;      // The currently active lesson
    private Progress progress;         // The progress of the current user in learning the current language
    private LanguageList languageList; // List of available languages in the application

    // Constructs a LanguageApplication with the specified user list, current user, current language,
    //dictionary, lesson list, current lesson, progress, and language list

    public LanguageApplication(){
        currentUser = null;
        DataLoader.loadUsers();
        DataLoader.loadLanguages();
    }

    /**
     * Creates a new user account with the specified username, email, and password
     * @param username the username for the new account
     * @param email the email for the new account
     * @param password the password for the new account
     * @return the created User object
     */
    // This UML really needs to name the variables
    public boolean createAccount(String username, String email, String password) {
        if(User.createAccount(username, email, password))
            return true;
        return false;
    }

    /**
     * Logs in a user with the specified username and password
     * @param username the username of the user
     * @param password the password of the user
     */

    public boolean login(String username, String password) {
        if(!userList.validLogin(username,password)){
            System.out.println("Invalid username or password.");
            return false;
        }
        this.currentUser = userList.getUser(username);
        System.out.println("Successfully logged into: " + username);
        return true;
    }

    // Logs out the current user and clears the session data
    public void logout() {
        DataWriter.saveUsers();
        //DataWriter.saveLangauges();
        userList.clear();
        currentUser = null;
        currentLanguage = null;
        dictionary = null;
        lessonList = null;
        progress = null;
        languageList = null;
    }

    // Sets the currently active language for the user
    public void setLanguage(Language language) {
        this.currentLanguage = language;
    }

    // Adds a new language to the list of available languages
    public void addLanguage(Language language) {
        languageList.addLanguage(language);
    }

    // Adds a lesson to a specified category
    public void addCategoryToLanguage(Category category, Language language) {
        language.addCategory(category);
    }

    // Adds a word to the specified language
    public void addWordToLanguage(Language language, Word word) {
        language.addWord(word);
    }

    // Adds a phrase to the specified language
    public void addPhraseToLanguage(Language language, Phrase phrase){
        language.addPhrase(phrase);
    }

    // Adds a story to the specified lesson in a language
    public void addLessonToCategory(Category category, Lesson lesson) {
        category.addLesson(lesson);
    }

    // Adds a story to the specified lesson in a language
    public void addStoryToLesson(Language language, Story story){
        //TODO: Method Stub
    }

    // Starts a lesson with the specified lesson number
    public void startLesson(int lessonNumber) {
        if (currentLesson != null && !lessonList.isEmpty()) {
            lessonList.get(lessonNumber).startLesson();
            currentLesson = lessonList.get(lessonNumber);
        }
    }

    // Retrieves the user's progress in the current language
    public Progress getProgress(){
        //TODO: Method Stub
        return null;
    }

    public Language getLanguage(String language) {
        return(languageList.findLanguage(language));
    }

    // Retrieves all words in the dictionary for the current language
    public WordList getDictionaryWords(){
        return dictionary.getAllWords();
    }

    // Retrieves the word of the day
    public Word getWordOfTheDay(){
        // TODO Create WOTD Method
        return null;
    }

    // Saves all language data
    public void saveAllLanguages(){
        //TODO: Method Stub
    }

    // Loads all language data
    public void loadAllLanguages(){
        //TODO: Method Stub
    }



}
