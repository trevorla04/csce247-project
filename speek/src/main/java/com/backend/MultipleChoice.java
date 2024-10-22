package speek.src.main.java.com.backend;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class MultipleChoice {

    // Attributes
    private String question;
    private List<String> answerChoices;
    private int correctAnswer;

    // Constructor to initialize question, choices, and correct answer
    public MultipleChoice(String question, List<String> answerChoices, int correctAnswer) {
        this.question = question;
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
    }

    // Method to return the type of question
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
