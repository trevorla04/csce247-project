package com.backend;

import java.util.List;
import java.util.UUID;

public class Language {
    public String name;
    public String abbreviation;   // The name of the language (e.g., "English")
    // Private attributes for managing the language's word list, phrase list, and categories
    private WordList wordList; // List of words associated with the language
    private PhraseList phraseList; // List of phrases associated with the language
    private List<Category> categories; // List of categories associated with the language
    private Progress currentProgress;  // The user's progress in learning this language
    private UUID uuid; // Unique identifier for the language


    /**
     * Constructs a {@code Language} object with the specified name, abbreviation, word list, phrase list, and lessons.
     * 
     * @param name the name of the language.
     * @param abbreviation the abbreviation of the language.
     * @param wordList the {@link WordList} containing words for this language.
     * @param phraseList the {@link PhraseList} containing phrases for this language.
     * @param lessons a list of lessons associated with this language (currently unused in this constructor).
     */
    // Now the reverse issue, these don't have data types.
    public Language(String name, String abbreviation, WordList wordList, PhraseList phraseList, List<Lesson> lessons){
        this.name = name;
        this.abbreviation = abbreviation;
        this.wordList = wordList;
        this.phraseList = phraseList;
        this.categories = categories;
    }

    /**
     * Adds a {@link Word} to the word list of this language.
     * 
     * @param word the {@link Word} to add to the language's word list.
     */
    public void addWord(Word word) {
        wordList.addWord(word);
    }

    /**
     * Adds a {@link Phrase} to the phrase list of this language.
     * 
     * @param phrase the {@link Phrase} to add to the language's phrase list.
     */
    public void addPhrase(Phrase phrase) {
        phraseList.addPhrase(phrase);
    }

    /**
     * Adds a {@link Category} to the list of categories for this language.
     * 
     * @param category the {@link Category} to add to the language's categories.
     */
    public void addCategory(Category category) {
        categories.add(category);
    }

    /**
     * Calculates the progress of the user in learning this language.
     * 
     * This method is currently unimplemented and returns {@code null}.
     * 
     * @return the {@link Progress} of the user in this language, or {@code null} if not implemented.
     */
    public Progress calculateProgress(){
        // TODO calc progress
        return null;
    }

    /**
     * Returns the name of the language.
     * 
     * @return the name of the language.
     */
    public String getName() {
        return name;
    }

}

