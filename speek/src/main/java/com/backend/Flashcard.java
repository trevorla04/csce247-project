package speek.src.main.java.com.backend;

public class Flashcard {
    
    private String front;
    private String back;

    public Flashcard(String front, String back) {
        this.front = front;
        this.back = back;
    }

    public String getFront() {
        return front;
    }

    public String getBack() {
        return back;
    }

    public String getType() {
        return "Flashcard";
    }

    public void askQuestion() {
        System.out.println("Question: " + front);
    }

    public boolean checkAnswer(String answer) {
        return back.equalsIgnoreCase(answer);
    }

    public static void main(String[] args) {
        Flashcard flashcard = new Flashcard("What is the capital of France?", "Paris");
        flashcard.askQuestion();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Your answer: ");
        String userAnswer = scanner.nextLine();

        if (flashcard.checkAnswer(userAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is: " + flashcard.getBack());
        }
        scanner.close();
    }
}
