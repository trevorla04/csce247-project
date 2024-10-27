package com.backend;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Matching implements Question {

    private String question;
    private List<Word> spanishWords;
    private List<Word> englishWords;
    private List<Word> shuffledSpanishWords;
    private List<Word> shuffledEnglishWords;
    private Language language;
    Scanner scanner = new Scanner(System.in);
    //private HashMap<String, String> correctMatches;

    /**
     * Constructs a Matching question with the specified question text, items to match, and correct matches
     * @param question       The text of the matching question
     * @param itemsToMatch   A list of items that need to be matched
     * @param correctMatches A map of correct matches where each key-value pair represents an item and its correct match
     */
    public Matching(List<Word> words, Language language) {
        this.language = language;
        this.question = "Match the following words or phrases.";
        this.englishWords = new ArrayList<>();
        this.spanishWords = new ArrayList<>();


        for (Word word : words) {
            englishWords.add(word);
            spanishWords.add(new Word(word.getTranslation(language)));
        }

        this.shuffledSpanishWords = new ArrayList<>(spanishWords);
        this.shuffledEnglishWords = new ArrayList<>(englishWords);
        Collections.shuffle(shuffledSpanishWords);
        Collections.shuffle(shuffledEnglishWords);
    }

    public void askQuestion() {

        System.out.println(question);

        for (int i = 0; i < shuffledSpanishWords.size(); i++) {
            System.out.println(i + shuffledSpanishWords.get(i));
        }

        System.out.println("\n");

        for (int i = 0; i < shuffledEnglishWords.size(); i++) {
            System.out.println(i + shuffledEnglishWords.get(i));
        }

        for (int i = 0; i < 3; i++){
            System.out.println("Enter number of spanish word to match");
            int spanishChoice = scanner.nextInt();
            System.out.println("Enter number of english word to match");
            int englishChoice = scanner.nextInt();
            checkAnswer(spanishChoice, englishChoice);
        }
    }

    public boolean checkAnswer(int spanishChoice, int englishChoice) {

        String chosenSpanishWord = shuffledSpanishWords.get(spanishChoice);
        String chosenEnglishWord = shuffledEnglishWords.get(englishChoice);

        int originalSpanishIndex = spanishWords.indexOf(chosenSpanishWord);
        int originalEnglishIndex = englishWords.indexOf(chosenEnglishWord);

        if (originalSpanishIndex == originalEnglishIndex) {
            System.out.println("Correct match!");
            return true;
        } else {
            System.out.println("Incorrect match. Try again.");
            return false;
        }
    }
}