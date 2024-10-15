import java.util.List;
import java.util.HashMap;
import java.util.UUID;

public class Matching {

    private String question;
    private List<String> itemsToMatch;
    private HashMap<String, String> correctMatches;
    private UUID uuid;

    public Matching(String question, List<String> itemsToMatch, HashMap<String, String> correctMatches) {
      this.question = question;
      this.itemsToMatch = itemsToMatch;
      this.correctMatches = correctMatches;
      this.uuid = UUID.randomUUID();
    }

    public String getType() {
        return "Matching";
    }

    public void askQuestion() {
     
    }

    public boolean checkAnswer(String answer) {
        return false; // Temporary
    }

    public UUID getUuid() {
        return uuid;
    }
}
