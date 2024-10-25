package com.backend;

import java.util.ArrayList;
import java.util.List;

public class WordList {
    private static WordList words;
    private ArrayList<Word> wordList;

    // Constructor that initializes the word list
    public WordList() {
        wordList = new ArrayList<>();
    }

    // Retrieves the single instance of WordList. Creates a new instance if none exists
    public static WordList getInstance ()
    {
        if (words == null)
        {
            words = new WordList();
        }
        return words;
    }

    // Adds a word to the word list if it does not already exist
    public void addWord(Word word) {
        if (!words.contains(word))
            words.addWord(word);
    }

    // Removes a word from the word list if it exists
    public void removeWord(Word word) {
        if (words.contains(word))
            words.removeWord(word);
    }

    // Retrieves a word at a specific index in the word list
    public Word getWord(int index) {
        return words.getWord(index);
    }

    // Searches for a word by its text and returns it if found
    public Word findWord(String searchWord) {
        for (Word word : wordList) {
            if (word.getWordString().equalsIgnoreCase(searchWord))
                return word;
        }
        return null;
    }

    // Returns the size of the word list
    public int getSize() {
        return wordList.size();
    }

    // Prints the word at the specified index to the console
    public void printWord(int index) {
        System.out.println(words.getWord(index));
    }

    // Clears all words from the word list
    public void clear() {
        wordList.clear();
    }

    // Checks if the word list contains a specific Word object
    public boolean contains (Word word)
    {
        return wordList.contains(word);
    }

    // Checks if the word list is empty
    public boolean isEmpty ()
    {
        return wordList.isEmpty();
    }

    // Placeholder method to save words
    public void saveWord() {
        //TODO implementation

    }

    // Placeholder method to load words
    public void loadWord() {
        //TODO implementation
        
    }

}
