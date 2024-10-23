package com.backend;

import java.util.HashMap;
import java.util.UUID;

public class Word {
    private UUID uuid = UUID.randomUUID();
    private HashMap<Language,String> translations = new HashMap<Language,String>();
    private String partOfSpeech;



    public Word(HashMap<Language,String> translations, UUID uuid){
        if (translations != null){
            this.translations = translations;
        }
        if(uuid != null){
            this.uuid = uuid;
        }

    }
    public String getWordString(Language language){
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

    
    // Java methods
    public String toString(Language language) {
        return word + ", defined as: \"" + translations.get(language) + "\" in " + language;
    }
    
    public boolean equals(Word word) {
        return

    }
    
}
