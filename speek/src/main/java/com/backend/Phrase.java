package com.backend;

import java.util.HashMap;

public class Phrase {
    private String phrase;
    private String definition;
    private Language language;
    private HashMap<Language,String> translations;
    
    public Phrase(String phrase, String definition, Language language, HashMap<Language,String> translations) {
        this.phrase = phrase;
        this.definition = definition;
        this.language = language;
        this.translations = translations != null ? translations : new HashMap<Language, String>();
    }

    public String getPhrase(){
        return phrase;
    }
    public void setPhrase(String phrase){
        if (phrase != null){
            this.phrase = phrase;
        }
    }
    
    public Language getLanguage(){
        return language;
    }
    
    public void setLanguage(Language language) {
        if (language != null) {
            this.language = language;
        }
    }
    public String getTranslation(Language language) {
        return translations.get(language);
    }
    public void addTranslations(Language language, String phrase) {
        translations.put(language, phrase);
    }
    public void removetranslation(Language language){
        translations.remove(language);
    }
    public String getDefinition(){
        return definition;
    }
    
    public void setDefinition(String definition){
        this.definition = definition;
    }
    
    public String toString(){
        return this.phrase + " defined as: " + this.definition;
    }
    public boolean equals(Phrase phrase) {
        return phrase.getPhrase().equalsIgnoreCase(this.phrase) && phrase.getDefinition().equals(this.definition);
    }
    
}
