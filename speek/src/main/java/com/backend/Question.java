package com.backend;

/**
 * The Question interface defines the basic structure for various types of questions.
 * Implementing classes should provide the type of question, display the question text,
 * and validate the answer provided.
 */
public interface Question {

    // Displays or retrieves the question text.
    void askQuestion();

    /**
     * Checks if the provided answer is correct.
     * @param answer The user's answer as a string.
     * @return True if the answer is correct, false otherwise.
     */
    boolean checkAnswer(String answer);

}