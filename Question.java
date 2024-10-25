/**
 * The Question interface represents a general structure for various types of questions.
 * It provides methods to retrieve the question type, ask the question, and check an answer.
 */
public interface Question {

    /**
     * Retrieves the type of the question.
     *
     * @return a String representing the type of the question (e.g., multiple choice, true/false).
     */
    String getType();

    /**
     * Asks the question and returns it as a String.
     *
     * @return a String containing the question text.
     */
    String askQuestion();

    /**
     * Checks if the provided answer is correct.
     *
     * @param answer the answer to be checked
     * @return true if the answer is correct, false otherwise
     */
    boolean checkAnswer(String answer);

}
