package com.backend;

import java.util.*;

public class WordList {
    private HashMap<UUID,Word> UUIDLookup = new HashMap<>();;
    private HashMap<String,Word> stringLookup = new HashMap<>();
    // Constructor that initializes the word list
    public WordList(ArrayList<Word> words) {
        for(Word word:words){
            UUIDLookup.put(word.getUUID(),word);
            stringLookup.put(word.getWordString(),word);
        }

    }
    public WordList(){}


    // Adds a word to the word list if it does not already exist
    public void addWord(Word word) {
        if(stringLookup.get(word.getWordString()) != null){
            return;
        }
        stringLookup.put(word.getWordString(),word);
        UUIDLookup.put(word.getUUID(),word);


    }
    // Removes a word from the word list if it exists
    public void removeWord(Word word) {
        stringLookup.remove(word.getWordString());

    }

    public Word getWord(UUID uuid){
        return UUIDLookup.get(uuid);
    }
    public Word getWord(String word){
        return stringLookup.get(word);
    }
    public boolean containsWord(Word word){
        return UUIDLookup.get(word.getUUID()) != null;
    }
    public boolean containsWord(String wordString){
        return stringLookup.get(wordString) != null;
    }

    public Word getRandomWord(){
        Word[] words = (Word[]) stringLookup.values().toArray();
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }

    public boolean isEmpty() {
        return stringLookup.isEmpty();
    }

    public int getSize() {
        return stringLookup.size();
    }

}
