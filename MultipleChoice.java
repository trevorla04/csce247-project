import java.util.Arrays;
import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        List<String> choices = Arrays.asList("Option A", "Option B", "Option C", "Option D");
        MultipleChoice question = new MultipleChoice("What is the capital of France?", choices, 1); // Correct answer is Option B

        question.askQuestion();

        Scanner scanner = new Scanner(System.in);
        int userAnswer = scanner.nextInt();

        if (question.checkAnswer(userAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect.");
        }
    }

    private void askQuestion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private boolean checkAnswer(int userAnswer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
