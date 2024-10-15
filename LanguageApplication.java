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

    public static LanguageApplication getInstance ()
    {
        if (LanguageApplication == null) 
        {
            LanguageApplication = new LanguageApplication();
        }
        return LanguageApplication;
    }
    // This UML really needs to name the variables
    public User createAccount(String username, String email, String password){
<<<<<<< HEAD
        return User.createAccount(username, email, password);
        
=======
        //TODO: Method Stub
        User user = new User(username, email, password);
        // How to add user?

>>>>>>> ca30b45365003a9a9c27b0a8694338cbb8268039
    }
    
    public User login(String username, String password){
        User newLogin = new User(username.)
    }
    
    public void logout(){
        //TODO: Method Stub
    }
    
    public void setLanguage(){
        //TODO: Method Stub
    }
    
    public void addLanguage(String pleaseNameYourVariablesInTheUMLNextTime, String iDontKnowWhatTheseAreFor){
        //TODO: Method Stub
    }
    
    public void addLesson(String unknownName, Lesson lesson){
        //TODO: Method Stub
    }
    public void addWordToLanguage(String language, Word word){
        //TODO: Method Stub
    }
    public void addPhraseToLanguage(String language, Phrase phrase){
        //TODO: Method Stub
    }
    public void addStoryToLesson(Language language, Story story){
        //TODO: Method Stub
    }
    public void startLesson(int lessonNumber){
        //TODO: Method Stub
    }
    public Progress getProgress(){
        //TODO: Method Stub
    }
    public List<String> getDictionaryWords(){
        //TODO: Method Stub
    }
    
    public void addWord(Word word){
        //TODO: Method Stub
    }
    public void addPhrase(Phrase phrase){
        //TODO: Method Stub
    }
    public Word getWordOfTheDay(){
        //TODO: Method Stub
    }
    public void saveAllLanguages(){
        //TODO: Method Stub
    }
    public void loadAllLanguages(){
        //TODO: Method Stub
    }
    
    
    
}
