package com.backend;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private List<Question> questions;
    private Category category;
    private Progress progress;
    private int difficulty;

    public void addQuestion(Question question) {
        if (question != null) {
            questions.add(question);
        }
    }

    public void addLearnedWord(Word word, Dictionary dictionary) {
        if (word != null && dictionary != null) {
            dictionary.addWord(word);
        }
    }

    public void showQuestion(Question question) {
        if (questions.contains(question)) {
            System.out.println("Question: " + question.getText());
        } else {
            System.out.println("Question not found in the lesson.");
        }
    }

    public void goToNextLesson() {
        // Logic to go to the next lesson (implementation can vary)
        System.out.println("Going to the next lesson...");
    }

    public void goToPreviousLesson() {
        // Logic to go to the previous lesson (implementation can vary)
        System.out.println("Going to the previous lesson...");
    }

    public void increaseDifficulty() {
        difficulty++;
        System.out.println("Increased difficulty to " + difficulty);
    }

    public void decreaseDifficulty() {
        if (difficulty > 1) {
            difficulty--;
            System.out.println("Decreased difficulty to " + difficulty);
        } else {
            System.out.println("Difficulty cannot be decreased further.");
        }
    }

    public void displayStory() {
        System.out.println("Displaying the story...");
        // Implementation for displaying the story goes here
    }

    public void exitStory() {
        System.out.println("Exiting the story...");
        // Logic to exit the story goes here
    }

    public void startLesson() {
        System.out.println("Starting the lesson...");
        // Logic to start the lesson goes here
    }

    public void endLesson() {
        System.out.println("Ending the lesson...");
        // Logic to end the lesson goes here
    }

    class Question {
        private String text;

        public Question(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }

    class Word {
        private String word;

        public Word(String word) {
            this.word = word;
        }

        public String getWord() {
            return word;
        }
    }

    class Dictionary {
        private List<Word> words;

        public Dictionary() {
            words = new ArrayList<>();
        }

        public void addWord(Word word) {
            if (word != null) {
                words.add(word);
            }
        }

        public List<Word> getWords() {
            return words;
        }
    }

    class Category {
        private String name;

        public Category(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    class Progress {
        private int currentQuestionIndex;

        public Progress() {
            this.currentQuestionIndex = 0;
        }

        public int getCurrentQuestionIndex() {
            return currentQuestionIndex;
        }

        public void nextQuestion() {
            currentQuestionIndex++;
        }

        public void previousQuestion() {
            if (currentQuestionIndex > 0) {
                currentQuestionIndex--;
            }
        }
    }
}
