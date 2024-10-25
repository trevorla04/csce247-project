/**
 * The Flashcard class represents a flashcard with a front (question) and back (answer).
 * It provides methods to retrieve the front and back text, display the question, 
 * check an answer, and get the type of the flashcard.
 */
public class Flashcard {
    
    /** The front of the flashcard, typically containing the question or prompt. */
    private String front;

    /** The back of the flashcard, typically containing the answer. */
    private String back;

    /**
     * Constructs a Flashcard with the specified front and back text.
     *
     * @param front the front text of the flashcard (question or prompt)
     * @param back the back text of the flashcard (answer)
     */
    public Flashcard(String front, String back) {
        this.front = front;
        this.back = back;
    }

    /**
     * Gets the text on the front of the flashcard.
     *
     * @return the front text
     */
    public String getFront() {
        return front;
    }

    /**
     * Gets the text on the back of the flashcard.
     *
     * @return the back text
     */
    public String getBack() {
        return back;
    }

    /**
     * Returns the type of this flashcard.
     *
     * @return a String indicating the type, which is "Flashcard"
     */
    public String getType() {
        return "Flashcard";
    }

    /**
     * Displays the question or prompt on the front of the flashcard.
     */
    public void askQuestion() {
        System.out.println("Question: " + front);
    }

    /**
     * Checks if the given answer matches the answer on the back of the flashcard.
     *
     * @param answer the answer to check
     * @return true if the answer matches (ignoring case), false otherwise
     */
    public boolean checkAnswer(String answer) {
        return back.equalsIgnoreCase(answer);
    }
}
