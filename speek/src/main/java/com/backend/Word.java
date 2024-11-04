package com.backend;

import java.util.HashMap;
import java.util.UUID;

public class Word {
    private UUID uuid;
    private String wordString;
    private String definition;
    // Words are now unique per language and no longer need translations stored for each.

    private String partOfSpeech;

    public UUID getUUID(){
        return this.uuid;
    }



    /**
     * Constructs a Word object with provided translations and UUID
     * If the translations map or UUID is null, default values are used
     * @param translations A map of translations by language
     * @param uuid         The unique identifier for this Word object
     */
    public Word(String wordString, String definition, UUID uuid){
        this.wordString = wordString;
        this.definition = definition;
        if(uuid != null){
            this.uuid = uuid;
        }
    }

    public Word(String wordString, String definition) {
        this.wordString = wordString;
        this.definition = definition;
        uuid = UUID.randomUUID();
    }

    /**
     * Retrieves the word string for a specified language
     * @param language The language of the requested translation
     * @return The translation in the specified language, or null if none exists
     */
    public String getWordString(){
        return wordString;
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
