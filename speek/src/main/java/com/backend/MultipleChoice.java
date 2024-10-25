package com.backend;

import java.util.List;

public class MultipleChoice {

    // Attributes
    private String question;
    private List<String> answerChoices;
    private int correctAnswer;

    /**
     * Constructs a MultipleChoice question with the specified question text, answer choices,
     * and index of the correct answer.
     * @param question      The text of the multiple-choice question.
     * @param answerChoices A list of possible answer choices.
     * @param correctAnswer The index of the correct answer in the answerChoices list (0-based).
     */
    public MultipleChoice(String question, List<String> answerChoices, int correctAnswer) {
        this.question = question;
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
    }

    /**
     * Returns the type of this question as "Multiple Choice".
     * @return A string representing the type of this question.
     */
    public String getType() {
        return "Multiple Choice";
    }

    // Method to display the question and answer choices
    public void askQuestion() {
        System.out.println("Question: " + question);
        for (int i = 0; i < answerChoices.size(); i++) {
            System.out.println((i + 1) + ": " + answerChoices.get(i));
        }
    }

    // Method to check if the provided answer is correct
    public boolean checkAnswer(String answer) {
        try {
            int selectedAnswer = Integer.parseInt(answer);
            return selectedAnswer == correctAnswer;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            return false;
        }
    }
}
