package com.backend;

import java.util.HashMap;
import java.util.List;

public class Matching implements Question {

    private String question;
    private List<String> itemsToMatch;
    private HashMap<String, String> correctMatches;

    /**
     * Constructs a Matching question with the specified question text, items to match, and correct matches
     * @param question       The text of the matching question
     * @param itemsToMatch   A list of items that need to be matched
     * @param correctMatches A map of correct matches where each key-value pair represents an item and its correct match
     */
    public Matching(List<String> itemsToMatch, HashMap<String, String> correctMatches) {
        this.question = "Match the following words or phrases.";
        this.itemsToMatch = itemsToMatch;
        this.correctMatches = correctMatches;
    }

    // Displays the question and the items to be matched. Prompts the user to provide answers in a specified format.
    public void askQuestion() {
        System.out.println(question);
        for (String item : itemsToMatch) {
            System.out.println(item);
        }
        System.out.println("Please provide your answers in the format 'englishWord1:languageWord1, " +
                "englishWord2:languageWord2,...'");
    }

    /**
     * Checks if the user's answer is correct by comparing it to the correct matches
     * @param answer The user's answer in the format 'item1:match1,item2:match2,...'
     * @return True if the user's matches are correct, false otherwise
     */
    public boolean checkAnswer(String answer) {
        String[] pairs = answer.split(",");
        HashMap<String, String> userMatches = new HashMap<>();

        for (String pair : pairs) {
            String[] items = pair.split(":");
            if (items.length == 2) {
                userMatches.put(items[0].trim(), items[1].trim());
            }
        }

        // Check if user's matches are correct
        for (String item : itemsToMatch) {
            if (!userMatches.getOrDefault(item, "").equals(correctMatches.get(item))) {
                System.out.println("Incorrect...");
                return false; // One or more matches are incorrect
            }
        }
        System.out.println("Correct!");
        return true; // All matches are correct
    }
}