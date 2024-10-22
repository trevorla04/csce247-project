package speek.src.main.java.com.backend;

import java.util.List;
import java.util.UUID;

public class Language {
    public String name;
    public String abbreviation;
    private WordList wordList;
    private PhraseList phraseList;
    private List<Category> categories;
    private Progress currentProgress;
    private UUID uuid;
    
    // Now the reverse issue, these dont have data types.
    public Language(String name, String abbreviation, WordList wordList, PhraseList phraseList, List<Lesson> lessons){
        this.name = name;
        this.abbreviation = abbreviation;
        this.wordList = wordList;
        this.phraseList = phraseList;
        this.categories = categories;
    }

    public void addWord(Word word) {
        wordList.addWord(word);
    }

    public void addPhrase(Phrase phrase) {
        phraseList.addPhrase(phrase);
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public Progress calculateProgress(){
        // TODO calc progress
        return null;
    }

    public String getName() {
        return name;
    }

}

