package com.backend;

import java.util.ArrayList;
import java.util.List;

public class PhraseList {
    private static PhraseList phrases;
    private List<Phrase> phraseList;



    public PhraseList(){
        phraseList = new ArrayList<>();
    }

    /**
     * Returns the single instance of PhraseList
     * If the instance does not exist, it creates one
     * @return the singleton instance of PhraseList
     */
    public static PhraseList getInstance() {
        if (phrases == null) {
            phrases = new PhraseList();
        }
        return phrases;
    }

     /**
     * Adds a phrase to the phrase list
     * If the phrase is already present in the list, it is not added again
     * @param phrase the {Phrase to be added to the list
     */
    public void addPhrase(Phrase phrase) {
        if (!phraseList.contains(phrase))
            phraseList.add(phrase);
    }

    /**
     * Removes the specified phrase from the list
     * @param phrase the Phrase to be removed from the list
     */
    public void removePhrase(Phrase phrase) {
        if (phraseList.contains(phrase)) {
            phraseList.remove(phrase);
        }
    }

     /**
     * Retrieves a phrase by its index in the list
     * @param index the index of the phrase in the list
     * @return the Phrase at the specified index, or null if the index is invalid
     */
    public Phrase getPhrase(int index) {
        if (index >= 0 && index < phraseList.size()) {
            return phraseList.get(index);
        }
        return null;
    }

    /**
     * Finds a phrase in the list by its text content, ignoring case
     * @param searchPhrase the text of the phrase to search for
     * @return the Phrase object matching the search term, or null if not found
     */
    public Phrase findPhrase(String searchPhrase) {
        for (Phrase phrase : phraseList)
            if (phrase.getPhrase().equalsIgnoreCase(searchPhrase))
                return phrase;
        return null;
    }

    /**
     * Checks if the list contains a specific phrase
     * @param cWord the Phrase to check
     * @return true if the phrase exists in the list, false otherwise
     */
    public boolean contains(Phrase cWord) {
        return phraseList.contains(cWord);
    }
    
    /**
     * Checks if the phrase list is empty
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return phraseList.isEmpty();
    }

    /**
     * Returns the size of the phrase list
     * @return the number of phrases in the list
     */
    public int getSize() {
        return phraseList.size();
    }

    /**
     * Prints the phrase at the specified index to the console
     * @param index the index of the phrase to print
     */
    public void printPhrase(int index) {
        Phrase phrase = getPhrase(index);
        if (phrase != null) {
            System.out.println(phrase.getPhrase());
        }
    }

    // Clears all phrases from the list
    public void clear() {
        phraseList.clear();
    }

    /**
     * Saves the current list of phrases.
     * <p>This method is currently not implemented.</p>
     */
    public void savePhrases() {

    }

    /**
     * Loads a list of phrases.
     * <p>This method is currently not implemented.</p>
     */
    public void loadPhrases() {

    }

}
