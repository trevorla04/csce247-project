package speek.src.main.java.com.backend;

import java.util.HashMap;

public class Word {
    private String word;
    private String definition;
    private Language language;
    private HashMap<Language,String> translations = new HashMap<Language,String>();
    private String partOfSpeech;
    
    
    public Word(String word, String definition, Language language){
        this.word = word;
        this.definition = definition;
        this.language = language;
        translations.put(language,word);


    }
    public String getWord(){
        // Getword should be renamed to getWordString to be clearer, as Word is the object.
        return this.word;
        
    }
    public void setWord(String word){
        this.word = word;
        translations.put(language,word);
        
        
    }
    public String getDefinition(){
        return this.definition;
    }
    public void setDefinition(){
        this.definition = definition;
    }
    public String getPartOfSpeech(){
        return this.partOfSpeech;
        
    }
    public void setPartOfSpeech(String speech){
        this.partOfSpeech = partOfSpeech;
    }
    public Language getLanguage(){
        return this.language;
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
    public String toString(){
        return word + ", defined as: " + definition;
    }
    
    public boolean equals(Word word) {
        String wordText = word.getWord();
        String wordPartOfSpeech = word.getPartOfSpeech();
        String wordDefinition = word.getDefinition();


        return this.word.equals(wordText) &&
                this.partOfSpeech.equals(wordPartOfSpeech) &&
                this.definition.equals(wordDefinition);

    }
    
}
