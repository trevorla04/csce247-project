import java.util.HashMap;

public class Word {
    private String word;
    private String definition;
    private Language language;
    private HashMap<Language,String> translations;
    private String partOfSpeech;
    
    
    public Word(String word, String definition, Language language){
        //TODO: Method Stub
    }
    public String getWord(){
        // Getword should be renamed to getWordString to be clearer, as Word is the object.
        //TODO: Method Stub
        
    }
    public void setWord(String word){
        //TODO: Method Stub
        
        
    }
    public String getDefinition(){
        //TODO: Method Stub
    }
    public void setDefinition(){
        //TODO: Method Stub
    }
    public String getPartOfSpeech(){
        //TODO: Method Stub
        
    }
    public void setPartOfSpeech(String speech){
        //TODO: Method Stub
    }
    public void getLanguage(){
        //TODO: Method Stub
    }
    public void addTranslation(String key, String value){
        // The UML should have the names for these variables, no?
        //TODO: Method Stub
    }
    public String getTranslation(Language language){
        // Unsure as to what this does?
        //TODO: Method Stub
    }
    public void removeTranslation(Language language){
        //TODO: Method Stub
    }
    
    // Java methods
    public String toString(){
        //TODO: Method Stub
    }
    
    public boolean equals(Word word) {
        //TODO: Method Stub
    }
    
}
