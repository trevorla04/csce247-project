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
    public Flashcard(Word word, Language language) {
        this.front = word.getWordString();
        this.back = word.getTranslation(language);
    }

    public Flashcard(Phrase phrase, Language language) {
        this.front = phrase.getPhrase();
        this.back = phrase.getTranslation(language);
    }

    /**
     * Returns the front (question) of the flashcard
     * @return the front of the flashcard
     */
    public String getFront() {
        return front;
    }

    /**
     * Returns the back (answer) of the flashcard
     * @return the back of the flashcard
     */
    public String getBack() {
        return back;
    }

}
