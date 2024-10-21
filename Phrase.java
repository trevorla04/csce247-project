import java.util.HashMap;
import java.util.ArrayList;

public class Phrase {
    private String phrase;
    private String definition;
    private Language language;
    private ArrayList<HashMap<String,String>> translations;
    
    public Phrase(String phrase, String definition, Language language, ArrayList<HashMap<String,String>> translations) {
        this.phrase = phrase;
        this.definition = definition;
        this.language = language;
        this.translations = translations != null ? translations : new ArrayList<HashMap<String, String>>();
    }
    public String getPhrase(){
        return phrase;
    }
    public void setPhrase(String phrase){
        if (phrase == null)
            this.phrase = phrase;
    }
    
    public Language getLanguage(){
        return language;
    }
    
    public void setLanguage(Language language) {
        if (language == null)
            this.language = language;
    }
    public String getTranslation(Language language) {

    }
    public void addTranslations(Language language, String phrase) {
        translations.put(language, phrase);
    }
    public void removetranslation(Language language){
        //TODO: Method Stub
    }
    public String getDefinition(){
        //TODO: Method Stub
    }
    
    public void setDefinition(String definition){
        //TODO: Method Stub
    }
    
    public String toString(){
        //TODO: Method Stub
    }
    public boolean equals(Phrase phrase){
        //TODO: Method Stub
    }
    
}
