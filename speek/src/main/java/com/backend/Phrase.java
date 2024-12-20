package com.backend;

import java.util.HashMap;

public class Phrase {
    private String phraseString;
    private String definition;
    private Language language;
    private HashMap<Language,String> translations;
    
    /**
     * Constructs a Phrase with the specified text, definition, language, and translations
     * @param phrase       The text of the phrase
     * @param definition   The definition of the phrase
     * @param language     The language of the phrase
     * @param translations A map of translations for the phrase, keyed by language
     */
    public Phrase(String phrase, String definition, Language language, HashMap<Language,String> translations) {
        this.phraseString = phrase;
        this.definition = definition;
        this.language = language;
        this.translations = translations != null ? translations : new HashMap<Language, String>();
    }

    public Phrase(String phraseString, HashMap<Language, String> translations) {
        this.phraseString = phraseString;
        this.translations = translations != null ? translations : new HashMap<Language, String>();
    }

    // Returns the phrase text
    public String getPhraseString(){
        return phraseString;
    }

    // Sets the phrase text
    public void setPhraseString(String phraseString) {
        if (phraseString != null){
            this.phraseString = phraseString;
        }
    }
    
    // Returns the language of the phrase
    public Language getLanguage(){
        return language;
    }
    
    // Sets the language of the phrase
    public void setLanguage(Language language) {
        if (language != null) {
            this.language = language;
        }
    }

    // Returns the translation of the phrase in the specified language
    public String getTranslation(Language language) {
        return translations.get(language);
    }

    // Adds or updates a translation for the phrase in the specified language
    public void addTranslations(Language language, String phrase) {
        translations.put(language, phrase);
    }

    // Removes the translation for the specified language
    public void removetranslation(Language language){
        translations.remove(language);
    }

    // Returns the definition of the phrase
    public String getDefinition(){
        return definition;
    }
    
    // Sets the definition of the phrase
    public void setDefinition(String definition){
        this.definition = definition;
    }
    
    // Returns a string representation of the phrase with its definition
    public String toString(){
        return this.phraseString + " defined as: " + this.definition;
    }

    // Checks if two phrases are equal by comparing their text and definitions, ignoring case differences in the text
    public boolean equals(Phrase phrase) {
        return phrase.getPhraseString().equalsIgnoreCase(this.phraseString) && phrase.getDefinition().equals(this.definition);
    }
    
}
