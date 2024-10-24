package com.backend;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Dictionary {

    // Private attributes
    private WordList wordsLearned; //stores all learned words
    private PhraseList phrasesLearned; //stores all learned phrases
    private Word wordOfTheDay; // Tracks the current word of the day

    // Public method to add a word to the dictionary
    public void addWord(Word word) {
        if (word != null) {
            wordsLearned.addWord(word);
        }
    }

    // Public method to add a phrase to the dictionary
    public void addPhrase(Phrase phrase) {
        if (phrase != null) {
            phrasesLearned.addPhrase(phrase);
        }
    }

    // Public method to access the word of the day
    public Word accessWordOfTheDay() {
        if (wordsLearned.isEmpty()) {
            return null; // No word of the day if no words have been learned
        }
        if (wordOfTheDay == null) { // If no word of the day is set, choose one
            int index = ThreadLocalRandom.current().nextInt(wordsLearned.getSize());
            wordOfTheDay = wordsLearned.getWord(index);
        }
        return wordOfTheDay;
    }

    // Public method to remove a word from the dictionary
    public void removeWord(Word word) {
        if (word != null) {
            wordsLearned.removeWord(word);
            removeWordOfTheDay(word); // If this is the word of the day, remove it
        }
    }

    // Public method to remove a phrase from the dictionary
    public void removePhrase(Phrase phrase) {
        if (phrase != null) {
            phrasesLearned.removePhrase(phrase);
        }
    }

    // Private method to add or update the word of the day
    private void addWordOfTheDay(Word word) {
        if (word != null) {
            wordOfTheDay = word;
        }
    }

    // Private method to remove the word of the day
    private void removeWordOfTheDay(Word word) {
        if (word != null && word.equals(wordOfTheDay)) {
            wordOfTheDay = null; // Clear the word of the day if it matches
        }
    }

    // Retrieves the list of all learned words.
    public WordList getAllWords() {
        return this.wordsLearned;
    }
}
