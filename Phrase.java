import java.util.HashMap;
import java.util.ArrayList;

public class Phrase {
    private String phrase;
    private String definition;
    private Language language;
    private HashMap<String, String> translations;
    
    public Phrase(String phrase, String definition, Language language, HashMap<String,String> translations) {
        this.phrase = phrase;
        this.definition = definition;
        this.language = language;
        this.translations = translations != null ? translations : new HashMap<>();
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
        if (language != null)
            this.language = language;
    }
    public String getTranslation(Language language) {
        return translations.get(language.name);
    }
    public void addTranslations(Language language, String phrase) {
        translations.put(language.name, phrase);
    }
    public void removetranslation(Language language){
        translations.remove(language.name);
    }
    public String getDefinition(){
        return this.definition;
    }
    
    public void setDefinition(String definition){
        this.definition = definition;
    }
    
    public String toString(){
        return this.phrase + " defined as: " + this.definition;
    }
    public boolean equals(Phrase phrase){
        String compPhrase = phrase.getPhrase();
        String compDef = phrase.getDefinition();
        return this.phrase.equals(compPhrase) && this.definition.equals(compDef);
    }
    
}
