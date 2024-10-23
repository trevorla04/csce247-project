package com.backend;

import java.util.ArrayList;
import java.util.List;

public class WordList {
    private static WordList words;
    private ArrayList<Word> wordList;

    public WordList() {
        wordList = new ArrayList<>();
    }

    public static WordList getInstance ()
    {
        if (words == null)
        {
            words = new WordList();
        }
        return words;
    }

    public void addWord(Word word) {
        if (!words.contains(word))
            words.addWord(word);
    }

    public void removeWord(Word word) {
        if (words.contains(word))
            words.removeWord(word);
    }

    public Word getWord(int index) {
        return words.getWord(index);
    }

    public Word findWord(String searchWord) {
        for (Word word : wordList) {
            if (word.getWordString().equalsIgnoreCase(searchWord))
                return word;
        }
        return null;
    }

    public int getSize() {
        return wordList.size();
    }

    public void printWord(int index) {
        System.out.println(words.getWord(index));
    }

    public void clear() {
        wordList.clear();
    }

    public boolean contains (Word word)
    {
        return wordList.contains(word);
    }

    public boolean isEmpty ()
    {
        return wordList.isEmpty();
    }

    public void saveWord() {

    }

    public void loadWord() {

    }

}
