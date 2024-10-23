package com.backend;

import java.util.List;
import java.util.ArrayList;

public class PhraseList extends Phrase {
    private static PhraseList phrases;
    private List<Phrase> phraseList;

    public PhraseList(){
        phraseList = new ArrayList<>();
    }

    public static PhraseList getInstance() {
        if (phrases == null) {
            phrases = new PhraseList();
        }
        return phrases;
    }

    public void addPhrase(Phrase phrase) {
        if (!phraseList.contains(phrase))
            phraseList.add(phrase);
    }

    public void removePhrase(Phrase phrase) {
        if (phraseList.contains(phrase)) {
            phraseList.remove(phrase);
        }
    }

    public Phrase getPhrase(int index) {
        if (index >= 0 && index < phraseList.size()) {
            return phraseList.get(index);
        }
        return null;
    }

    public Phrase findPhrase(String searchPhrase) {
        for (Phrase phrase : phraseList)
            if (phrase.getPhrase().equalsIgnoreCase(searchPhrase))
                return phrase;
        return null;
    }

    public boolean contains(Phrase cWord) {
        return phraseList.contains(cWord);
    }

    public boolean isEmpty() {
        return phraseList.isEmpty();
    }

    public int getSize() {
        return phraseList.size();
    }

    public void printPhrase(int index) {
        Phrase phrase = getPhrase(index);
        if (phrase != null) {
            System.out.println(phrase.getPhrase());
        }
    }


    public void clear() {
        phraseList.clear();
    }

    public void savePhrases() {

    }

    public void loadPhrases() {

    }

}
