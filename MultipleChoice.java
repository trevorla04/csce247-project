import java.util.List;

/**
 * The MultipleChoice class represents a multiple-choice question with a list of answer choices.
 * It provides methods to retrieve the question type, display the question with answer choices, 
 * and check if a given answer is correct.
 */
public class MultipleChoice {

    /** The question text. */
    private String question;

    /** A list of possible answer choices. */
    private List<String> answerChoices;

    /** The index of the correct answer in the answerChoices list. */
    private int correctAnswer;

    /**
     * Constructs a MultipleChoice question with the specified question text, answer choices, and correct answer.
     *
     * @param question the text of the question
     * @param answerChoices a list of answer choices for the question
     * @param correctAnswer the index of the correct answer in the answerChoices list (1-based index)
     */
    public MultipleChoice(String question, List<String> answerChoices, int correctAnswer) {
        this.question = question;
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
    }

    /**
     * Returns the type of the question.
     *
     * @return a String indicating the type, which is "Multiple Choice"
     */
    public String getType() {
        return "Multiple Choice";
    }

    /**
     * Displays the question along with its answer choices.
     */
    public void askQuestion() {
        System.out.println("Question: " + question);
        for (int i = 0; i < answerChoices.size(); i++) {
            System.out.println((i + 1) + ": " + answerChoices.get(i));
        }
    }

    /**
     * Checks if the provided answer matches the correct answer.
     *
     * @param answer the answer provided as a String, which should be a number corresponding to the answer choice
     * @return true if the answer matches the correct answer, false otherwise
     */
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
