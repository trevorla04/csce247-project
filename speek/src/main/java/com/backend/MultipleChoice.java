package com.backend;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoice<T> implements Question {

    // Attributes
    private String question;
    private ArrayList<T> answerChoices;
    private int correctAnswer;

    /**
     * Constructs a MultipleChoice question with the specified question text, answer choices, and index of the correct answer
     * @param question      The text of the multiple-choice question
     * @param answerChoices A list of possible answer choices
     * @param correctAnswer The index of the correct answer in the answerChoices list (0-based)
     */
    public MultipleChoice(String question, ArrayList<T> answerChoices, int correctAnswer) {
        this.question = question;
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
    }

    // Method to display the question and answer choices
    public void askQuestion() {
        System.out.println("Question: " + question);
        com.narriation.Narriator.playSound(question);

        for (int i = 0; i < answerChoices.size(); i++) {
            T choice = answerChoices.get(i);
            String answerText;

            if (choice instanceof Word)
                answerText = ((Word) choice).getWordString();
            else if (choice instanceof Phrase)
                answerText = ((Phrase) choice).getPhraseString();
            else
                answerText = choice.toString();

            System.out.println((i + 1) + ": " + answerText);
            com.narriation.Narriator.playSound(answerText);
        }
        /*
        System.out.println("Question: " + question);
        com.narriation.Narriator.playSound(question);
        for (int i = 0; i < answerChoices.size(); i++) {
            System.out.println((i + 1) + ": " + answerChoices.get(i));
            com.narriation.Narriator.playSound(answerChoices.get(i).);
        }
        */
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
