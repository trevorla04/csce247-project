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
    }

    public boolean checkAnswer(String answer) {
        return back.equalsIgnoreCase(answer);
    }
}
