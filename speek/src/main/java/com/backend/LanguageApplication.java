package com.backend;

import java.util.List;

public class LanguageApplication {
    // Private attributes for managing user, language, and application data
    private UserList userList;         // List of users in the application
    private User currentUser;          // The currently logged-in user
    private Language currentLanguage;  // The currently selected language
    private Dictionary dictionary;     // The dictionary associated with the current language
    private List<Lesson> lessonList;   // List of lessons available in the current language
    private Lesson currentLesson;      // The currently active lesson
    private Progress progress;         // The progress of the current user in learning the current language
    private LanguageList languageList; // List of available languages in the application
    
    /**
     * Constructs a {@code LanguageApplication} with the specified user list, current user, current language,
     * dictionary, lesson list, current lesson, progress, and language list.
     * 
     * @param userlist the list of users.
     * @param currentUser the currently logged-in user.
     * @param currentLanguage the currently selected language.
     * @param dictionary the dictionary of words and phrases for the selected language.
     * @param lessonList the list of lessons available for the selected language.
     * @param currentLesson the currently active lesson.
     * @param progress the user's progress in learning the current language.
     * @param languageList the list of available languages in the application.
     */
    public LanguageApplication (UserList userlist, User currentUser, Language currentLanguage, Dictionary dictionary, List<Lesson> lessonList, Lesson currentLesson, Progress progress, LanguageList languageList) {
        this.userList = userlist;
        this.currentUser = currentUser;
        this.currentLanguage = currentLanguage;
        this.dictionary = dictionary;
        this.lessonList = lessonList;
        this.progress = progress;
        this.languageList = languageList;
    }

    /**
     * Creates a new user account with the specified username, email, and password.
     * 
     * @param username the username for the new account.
     * @param email the email for the new account.
     * @param password the password for the new account.
     * @return the created {@link User} object.
     */
    // This UML really needs to name the variables
    public User createAccount(String username, String email, String password) {
        User.createAccount(username, email, password);
        return currentUser = userList.getUser(username);
    }
    
    /**
     * Logs in a user with the specified username and password.
     * 
     * @param username the username of the user.
     * @param password the password of the user.
     */
    public void login(String username, String password){
        if (userList.getUser(username) != null && userList.getUser(username).getPassword().equals(password))
            currentUser = userList.getUser(username);
        else
            System.out.println("Username or password is incorrect.");
    }
    
    /**
     * Logs out the current user and clears the session data.
     */
    public void logout(){

        userList.clear();
        currentUser = null;
        currentLanguage = null;
        dictionary = null;
        lessonList = null;
        progress = null;
        languageList = null;
    }
    
    /**
     * Sets the currently active language for the user.
     * 
     * @param language the {@link Language} to set as the current language.
     */
    public void setLanguage(Language language) {
        this.currentLanguage = language;
    }
    
    /**
     * Adds a new language to the list of available languages.
     * 
     * @param language the {@link Language} to add.
     */
    public void addLanguage(Language language) {
        languageList.addLanguage(language);
    }
    
    // Adds a lesson to a specified category.
    public void addLesson(Category category, Lesson lesson) {
        category.addLesson(lesson);
    }

    // Adds a word to the specified language.
    public void addWordToLanguage(Language language, Word word) {
        language.addWord(word);
    }

    // Adds a phrase to the specified language.
    public void addPhraseToLanguage(Language language, Phrase phrase){
        language.addPhrase(phrase);
    }

    // Adds a story to the specified lesson in a language.
    public void addLessonToCategory(Category category, Lesson lesson) {
        Category.addLesson(lesson);
    }

    // Adds a story to the specified lesson in a language.
    public void addStoryToLesson(Language language, Story story){
        //TODO: Method Stub
    }

    // Starts a lesson with the specified lesson number.
    public void startLesson(int lessonNumber) {
        if (currentLesson != null && !lessonList.isEmpty()) {
            lessonList.get(lessonNumber).startLesson();
            currentLesson = lessonList.get(lessonNumber);
        }
    }

    // Retrieves the user's progress in the current language.
    public Progress getProgress(){
        //TODO: Method Stub
        return null;
    }

    // Retrieves all words in the dictionary for the current language.
    public WordList getDictionaryWords(){
        return dictionary.getAllWords();
    }

    // Retrieves the word of the day.
    public Word getWordOfTheDay(){
        // TODO Create WOTD Method
        return null;
    }

    // Saves all language data.
    public void saveAllLanguages(){
        //TODO: Method Stub
    }

    // Loads all language data.
    public void loadAllLanguages(){
        //TODO: Method Stub
    }
    
    
    
}
