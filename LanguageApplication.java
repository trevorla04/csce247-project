import java.util.List;

public class LanguageApplication {
    private LanguageApplication instance;
    private UserList userList = UserList.getInstance();
    private User currentUser;
    private Language currentLanguage;
    private Dictionary dictionary;
    private List<Lesson> lessonList;
    private Lesson currentLesson;
    private Progress progress;
    private LanguageList languageList;
    
    private LanguageApplication(){
        //TODO: Method Stub
    }
    public static LanguageApplication getInstance(){
        if(instance == null){
            instance = new LanguageApplication();
        }
        return instance;
        
        
    }
    
    
    // This UML really needs to name the variables
    public User createAccount(String username, String email, String password){
        //TODO: Method Stub
        User user = new User(username, email, password);
        // How to add user?
        
        
        
        
    }
    
    public User login(String username, String password){
        //TODO: Method Stub
    }
    
    public void logout(){
        //TODO: Method Stub
        // Clean up user changes
        
        
        
        
        
        
        currentUser = null;
        
        
        
    }
    
    public void setLanguage(){
        //TODO: Method Stub
    }
    
    public addLanguage(String name, String abbreviation){
        Language language = new Language(name, abbreviation, new WordList(), new PhraseList(), new ArrayList<Lesson>);
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
