package com.backend;

import java.util.HashMap;
import java.util.UUID;

public class Word {
    private UUID uuid = UUID.randomUUID();
    private HashMap<Language,String> translations = new HashMap<Language,String>();
    private String partOfSpeech;

    /**
     * Constructs a Word object with provided translations and UUID
     * If the translations map or UUID is null, default values are used
     * @param translations A map of translations by language
     * @param uuid         The unique identifier for this Word object
     */
    public Word(HashMap<Language,String> translations, UUID uuid){
        if (translations != null){
            this.translations = translations;
        }
        if(uuid != null){
            this.uuid = uuid;
        }

    }

    /**
     * Retrieves the word string for a specified language
     * @param language The language of the requested translation
     * @return The translation in the specified language, or null if none exists
     */
    public String getWordString(Language language){
        return translations.get(language);
    }

    /**
     * Sets or updates the definition of the word in the specified language
     * @param language   The language for the definition
     * @param definition The definition to set
     */
    public void setDefinition(Language language, String definition) {
        if (translations.get(language) != null)
            translations.put(language, definition);
    }

    // Retrieves the part of speech for this word
    public String getPartOfSpeech(){
        return this.partOfSpeech;
    }

    // Sets the part of speech for this word
    public void setPartOfSpeech(String speech){
        this.partOfSpeech = partOfSpeech;
    }

    // Adds a translation for a specified language
    public void addTranslation(Language language, String translation){
        translations.put(language,translation);
    }

    // Retrieves the translation for a specified language
    public String getTranslation(Language language){
        return translations.get(language);
    }

    // Removes the translation for a specified language
    public void removeTranslation(Language language){
        translations.remove(language);
    }

    // Returns a string representation of the Word object, showing translations in all languages
    // Java methods
    public String toString() {
        return translations.toString();
    }
    
    // Compares this Word object to another for equality based on translations and part of speech
    public boolean equals(Word word) {
        return false;

    }
    
}
