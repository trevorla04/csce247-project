package com.backend;

import java.util.UUID;

public class Phrase {
    private String phraseString;
    private String definition;
    private UUID uuid;
    
    /**
     * Constructs a Phrase with the specified text, definition, language, and translations
     * @param phrase       The text of the phrase
     * @param definition   The definition of the phrase
     * @param language     The language of the phrase
     * @param translations A map of translations for the phrase, keyed by language
     */
    public Phrase(String phrase, String definition, UUID uuid) {
        this.phraseString = phrase;
        this.definition = definition;
        this.uuid = uuid;
    }

    public Phrase(String phraseString, String definition) {
        this.phraseString = phraseString;
        this.definition = definition;
        this.uuid = UUID.randomUUID();
    }

    // Returns the phrase text
    public String getPhraseString() {
        return phraseString;
    }

    // Sets the phrase text
    public void setPhraseString(String phraseString) {
        if (phraseString != null){
            this.phraseString = phraseString;
        }
    }

    // Returns the definition of the phrase
    public String getDefinition() {
        return definition;
    }
    
    // Sets the definition of the phrase
    public void setDefinition(String definition) {
        this.definition = definition;
    }
    
    // Returns a string representation of the phrase with its definition
    public String toString() {
        return this.phraseString + " defined as: " + this.definition;
    }

    // Checks if two phrases are equal by comparing their text and definitions, ignoring case differences in the text
    public boolean equals(Phrase phrase) {
        return phrase.getPhraseString().equalsIgnoreCase(this.phraseString) && phrase.getDefinition().equals(this.definition);
    }
    
}
