package speek.src.main.java.com.backend;

import java.util.HashMap;

public class Word {
    private String word;
    private HashMap<Language,String> translations = new HashMap<Language,String>();
    private String partOfSpeech;
    
    
    public Word(String word, String definition, Language language){
        this.word = word;
        translations.put(language, definition);
    }
    public String getWordString(){
        return this.word;
    }
    public void setWord(Language language, String word){
        translations.put(language,this.word);
    }
    public String getDefinition(Language language){
        return translations.get(language);
    }
    public void setDefinition(Language language, String definition){
        if (translations.get(language) == null);
            translations.put(language, definition);
    }
    public String getPartOfSpeech(){
        return this.partOfSpeech;
        
    }
    public void setPartOfSpeech(String speech){
        this.partOfSpeech = partOfSpeech;
    }
    public HashMap<Language, String> getTranslations(){
        return this.translations;
    }
    public void removeTranslation(Language language){
        translations.remove(language);
    }
    
    // Java methods
    public String toString(Language language){
        return word + ", defined as: \"" + translations.get(language) + "\" in " + language;
    }
    
    public boolean equals(Word word) {
        return this.word.equals(word.getWordString()) &&
                this.partOfSpeech.equals(word.getPartOfSpeech()) &&
                this.translations.equals(word.getTranslations());
    }
    
}
