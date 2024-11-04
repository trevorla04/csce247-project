package com.backend;

public class Flashcard {
    
    // Private attributes for the front and back of the flashcard
    private String front; // The question or prompt displayed on the front
    private String back;  // The answer displayed on the back

    /**
     * Constructs a Flashcard object with a given question and answer
     * @param front the question or prompt on the front of the flashcard
     * @param back the answer on the back of the flashcard
     */
    public Flashcard(Word word) {
        this.front = word.getWordString();
        this.back = word.getDefinition();
    }

    public Flashcard(Phrase phrase) {
        this.front = phrase.getPhraseString();
        this.back = phrase.getDefinition();
    }

    /**
     * Returns the front (question) of the flashcard
     * @return the front of the flashcard
     */
    public String getFront() {
        com.narriation.Narriator.playSound(front);
        return front;
    }

    /**
     * Returns the back (answer) of the flashcard
     * @return the back of the flashcard
     */
    public String getBack() {
        com.narriation.Narriator.playSound(back);
        return back;
    }

}
