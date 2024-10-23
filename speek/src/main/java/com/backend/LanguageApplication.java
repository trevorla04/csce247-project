package com.backend;

import java.util.List;

public class LanguageApplication {
    private UserList userList;
    private User currentUser;
    private Language currentLanguage;
    private Dictionary dictionary;
    private List<Lesson> lessonList;
    private Lesson currentLesson;
    private Progress progress;
    private LanguageList languageList;
    
    public LanguageApplication (UserList userlist, User currentUser, Language currentLanguage, Dictionary dictionary, List<Lesson> lessonList, Lesson currentLesson, Progress progress, LanguageList languageList) {
        this.userList = userlist;
        this.currentUser = currentUser;
        this.currentLanguage = currentLanguage;
        this.dictionary = dictionary;
        this.lessonList = lessonList;
        this.progress = progress;
        this.languageList = languageList;
    }

    // This UML really needs to name the variables
    public User createAccount(String username, String email, String password) {
        User.createAccount(username, email, password);
        return currentUser = userList.getUser(username);
    }
    
    public void login(String username, String password){
        if (userList.getUser(username) != null && userList.getUser(username).getPassword().equals(password))
            currentUser = userList.getUser(username);
        else
            System.out.println("Username or password is incorrect.");
    }
    
    public void logout(){
        userList.saveUsers();
        userList.clear();
        currentUser = null;
        currentLanguage = null;
        dictionary = null;
        lessonList = null;
        progress = null;
        languageList = null;
    }
    
    public void setLanguage(Language language) {
        this.currentLanguage = language;
    }
    
    public void addLanguage(Language language) {
        languageList.addLanguage(language);
    }
    
    public void addLesson(Category category, Lesson lesson) {
        category.addLesson(lesson);
    }

    public void addWordToLanguage(Language language, Word word) {
        language.addWord(word);
    }

    public void addPhraseToLanguage(Language language, Phrase phrase){
        language.addPhrase(phrase);
    }

    public void addLessonToCategory(Category category, Lesson lesson) {
        Category.addLesson(lesson);
    }

    public void addStoryToLesson(Language language, Story story){
        //TODO: Method Stub
    }

    public void startLesson(int lessonNumber) {
        if (currentLesson != null && !lessonList.isEmpty()) {
            lessonList.get(lessonNumber).startLesson();
            currentLesson = lessonList.get(lessonNumber);
        }
    }

    public Progress getProgress(){
        //TODO: Method Stub
        return null;
    }

    public WordList getDictionaryWords(){
        return dictionary.getAllWords();
    }

    public Word getWordOfTheDay(){
        // TODO Create WOTD Method
    }

    public void saveAllLanguages(){
        //TODO: Method Stub
    }

    public void loadAllLanguages(){
        //TODO: Method Stub
    }
    
    
    
}
