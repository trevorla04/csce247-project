package com.backend;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private List<Question> questions;
    private Category category;
    private Progress progress;
    private int difficulty;

    /**
     * Adds a question to the lesson
     * @param question The question to add to the lesson
     */
    public void addQuestion(Question question) {
        if (question != null) {
            questions.add(question);
        }
    }

    /**
     * Adds a learned word to the specified dictionary
     * @param word      The word to add to the dictionary
     * @param dictionary The dictionary to add the word to
     */
    public void addLearnedWord(Word word, Dictionary dictionary) {
        if (word != null && dictionary != null) {
            dictionary.addWord(word);
        }
    }

    /**
     * Displays the specified question if it exists in the lesson
     * @param question The question to display
     */
    public void showQuestion(Question question) {
        if (questions.contains(question)) {
            System.out.println("Question: " + question.askQuestion());
        } else {
            System.out.println("Question not found in the lesson.");
        }
    }

    // Advances to the next lesson
    public void goToNextLesson() {
        // Logic to go to the next lesson (implementation can vary)
        System.out.println("Going to the next lesson...");
    }

    // Returns to the previous lesson
    public void goToPreviousLesson() {
        // Logic to go to the previous lesson (implementation can vary)
        System.out.println("Going to the previous lesson...");
    }

    // Increases the difficulty level of the lesson
    public void increaseDifficulty() {
        difficulty++;
        System.out.println("Increased difficulty to " + difficulty);
    }

    // Decreases the difficulty level of the lesson, with a minimum level of 1
    public void decreaseDifficulty() {
        if (difficulty > 1) {
            difficulty--;
            System.out.println("Decreased difficulty to " + difficulty);
        } else {
            System.out.println("Difficulty cannot be decreased further.");
        }
    }

    // Displays the lesson's story content
    public void displayStory() {
        System.out.println("Displaying the story...");
        // Implementation for displaying the story goes here
    }

    // Exits the lesson's story content
    public void exitStory() {
        System.out.println("Exiting the story...");
        // Logic to exit the story goes here
    }

    // Starts the lesson
    public void startLesson() {
        System.out.println("Starting the lesson...");
        // Logic to start the lesson goes here
    }

    // Ends the lesson
    public void endLesson() {
        System.out.println("Ending the lesson...");
        // Logic to end the lesson goes here
    }

}
