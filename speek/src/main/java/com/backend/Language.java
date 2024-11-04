package com.backend;

import java.util.ArrayList;
import java.util.UUID;

public class Language {
    /**
    Language is a data storage used to store refrences to various lessons. It should NOT be modified
    unless you want that change to be accessible to all users. Store information on progress
     in the progress class. - Keegan.
     **/
    // A list of available lessons for this langauge;
    private ArrayList<Lesson> lessonList;
    private String languageName;
    // Private attributes for managing the language's word list, phrase list, and categories
    private WordList wordList; // List of words associated with the language
    private PhraseList phraseList; // List of phrases associated with the language
    private UUID uuid; // Unique identifier for the language


    /**
     * Constructs a Language object with the specified name, abbreviation, word list, phrase list, and lessons.
     * @param wordList the WordList containing words for this language.
     * @param phraseList the PhraseList containing phrases for this language.
     */
    public Language(String languageName, WordList wordList, PhraseList phraseList, UUID uuid) {
        this.languageName = languageName;
        this.wordList = wordList;
        this.phraseList = phraseList;
        this.uuid = uuid;
    }

    public WordList getWordList() {
        return wordList;
    }

    public PhraseList getPhraseList() {
        return phraseList;
    }

    public ArrayList<Lesson> getLessonList(){
        return lessonList;
    }


    /**
     * Adds a Phrase to the phrase list of this language.
     * @param phrase the Phrase to add to the language's phrase list.
     */
    public void addPhrase(Phrase phrase) {
        phraseList.addPhrase(phrase);
    }


    /**
     * Calculates the progress of the user in learning this language.
     * This method is currently unimplemented and returns null
     * @return the Progress of the user in this language, or null if not implemented.
     */

    /**
     * Returns the name of the language.
     * @return the name of the language.
     */
    public String getName() {
        return languageName;
    }

}

