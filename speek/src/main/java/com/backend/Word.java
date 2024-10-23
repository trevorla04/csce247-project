package com.backend;

import java.util.HashMap;

public class Word {
    private String word;
    private HashMap<Language,String> translations = new HashMap<Language,String>();
    private String partOfSpeech;
    
    
    public Word(String word, String definition, Language language){
        this.word = word;
        translations.put(language, definition);
    }
    public String getWordString() {
        return this.word;
    }
    public void setWordString(String word) {
        this.word = word;
    }
    public String getDefinition(Language language){
        return translations.get(language);
    }
    public void setDefinition(Language language, String definition) {
        if (translations.get(language) != null)
            translations.put(language, definition);
    }
    public String getPartOfSpeech(){
        return this.partOfSpeech;
    }
    public void setPartOfSpeech(String speech){
        this.partOfSpeech = partOfSpeech;
    }
    public void addTranslation(Language language, String translation){
        translations.put(language,translation);
    }
    public String getTranslation(Language language){
        return translations.get(language);
    }
    public void removeTranslation(Language language){
        translations.remove(language);
    }

    public HashMap<Language, String> getTranslations() {
        return translations;
    }
    
    // Java methods
    public String toString(Language language) {
        return word + ", defined as: \"" + translations.get(language) + "\" in " + language;
    }
    
    public boolean equals(Word word) {
        return this.word.equals(word.getWordString()) &&
                this.partOfSpeech.equals(word.getPartOfSpeech()) &&
                this.translations.equals(word.getTranslations());

    }
    
}
