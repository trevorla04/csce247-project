import java.util.List;
import java.util.UUID;
public class MultipleChoice {

    private String question;
    private List<String> answerChoices;
    private String correctAnswer;
    private UUID uuid;

    public MultipleChoice(String question, List<String> answerChoices, String correctAnswer) {
        this.question = question;
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
        this.uuid = UUID.randomUUID();
    }

    public String getType() {
        return "Multiple Choice";
    }

    public void askQuestion() {
       
    }

    public boolean checkAnswer(String answer) {
      
    }

    public UUID getUuid() {
        return uuid;
    }
}
