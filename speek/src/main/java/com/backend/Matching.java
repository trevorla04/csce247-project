package speek.src.main.java.com.backend;

import java.util.HashMap;
import java.util.List;

public class Matching {

    private String question;
    private List<String> itemsToMatch;
    private HashMap<String, String> correctMatches;

    public Matching(String question, List<String> itemsToMatch, HashMap<String, String> correctMatches) {
        this.question = question;
        this.itemsToMatch = itemsToMatch;
        this.correctMatches = correctMatches;
    }

    public String getType() {
        return "Matching";
    }

    public void askQuestion() {
        System.out.println(question);
        for (String item : itemsToMatch) {
            System.out.println(item);
        }
        System.out.println("Please provide your answers in the format 'item1:match1,item2:match2,...'");
    }

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