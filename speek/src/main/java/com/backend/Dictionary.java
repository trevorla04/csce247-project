<<<<<<< HEAD:speek/src/main/java/com/backend/Dictionary.java
package com.backend;
=======
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
>>>>>>> a050378218e55f610588a3b5d79fd683b550d4c5:Dictionary.java

public class Dictionary {

    // Private attributes
    private WordList wordsLearned;
    private PhraseList phrasesLearned;
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
            phrasesLearned.add(phrase);
        }
    }

    // Public method to access the word of the day
    public Word accessWordOfTheDay() {
        if (wordsLearned.isEmpty()) {
            return null; // No word of the day if no words have been learned
        }
        if (wordOfTheDay == null) { // If no word of the day is set, choose one
            int index = ThreadLocalRandom.current().nextInt(wordsLearned.size());
            wordOfTheDay = wordsLearned.get(index);
        }
        return wordOfTheDay;
    }

    // Public method to remove a word from the dictionary
    public void removeWord(Word word) {
        if (word != null) {
            wordsLearned.remove(word);
            removeWordOfTheDay(word); // If this is the word of the day, remove it
        }
    }

    // Public method to remove a phrase from the dictionary
    public void removePhrase(Phrase phrase) {
        if (phrase != null) {
            phrasesLearned.remove(phrase);
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
}
