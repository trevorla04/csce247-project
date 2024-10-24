package com.backend;

public class Flashcard {
    
    // Private attributes for the front and back of the flashcard
    private String front; // The question or prompt displayed on the front
    private String back;  // The answer displayed on the back

    /**
     * Constructs a {@code Flashcard} object with a given question (front) and answer (back).
     * 
     * @param front the question or prompt on the front of the flashcard.
     * @param back the answer on the back of the flashcard.
     */
    public Flashcard(String front, String back) {
        this.front = front;
        this.back = back;
    }

    /**
     * Returns the front (question) of the flashcard.
     * 
     * @return the front of the flashcard.
     */
    public String getFront() {
        return front;
    }

    /**
     * Returns the back (answer) of the flashcard.
     * 
     * @return the back of the flashcard.
     */
    public String getBack() {
        return back;
    }

    /**
     * Returns the type of this flashcard, which is "Flashcard".
     * 
     * @return the string "Flashcard".
     */
    public String getType() {
        return "Flashcard";
    }

    /**
     * Prints the question on the front of the flashcard to the console.
     * This simulates asking the user the question on the flashcard.
     */
    public void askQuestion() {
        System.out.println("Question: " + front);
    }

    /**
     * Checks if the provided answer matches the answer on the back of the flashcard.
     * The comparison is case-insensitive.
     * 
     * @param answer the answer provided by the user.
     * @return {@code true} if the provided answer matches the back of the flashcard, {@code false} otherwise.
     */
    public boolean checkAnswer(String answer) {
        return back.equalsIgnoreCase(answer);
    }

    /**
     * Main method to demonstrate the functionality of the {@code Flashcard} class.
     * It asks a question and checks the user's input against the correct answer.
     * 
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        Flashcard flashcard = new Flashcard("What is the capital of France?", "Paris");
        flashcard.askQuestion();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Your answer: ");
        String userAnswer = scanner.nextLine();

        if (flashcard.checkAnswer(userAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is: " + flashcard.getBack());
        }
        scanner.close();
    }
}
