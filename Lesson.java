public class Lesson
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.Locale.Category;
{
    private List<Question> questions;
    private Category category;
    private Progress progress;
    private int difficulty;

    public Lesson(List<Question> questions, Category category, int difficulty) 
    {
        this.questions = new List<Question> ();
        this.category = category;
        this.difficulty = difficulty;
    }

    public void addQuestion(Question question) 
    {
        questions.add(question);
    }

    public void addLearnedWord(Word word, Dictionary dictionary) 
    {
        dictionary.wordsLearned.add(word);
    }

    public void showQuestion(Question question) 
    {
        System.out.println(question.toString());
    }

    public void goToNextLesson() 
    {
        if (QuestionIndex < questions.size() - 1) 
        {
            //QuestionIndex++; need to see question class
        } 
        else 
        {
            System.out.println("No more questions!.");
        }
    }

    public void goToPreviousLesson() 
    {
        if (QuestionIndex > 0) 
        {
            //QuestionIndex--; need to see question class

        } 
        else 
        {
            System.out.println("No previous questions!");
        }
    }

    public void increaseDifficulty()
    {
        difficulty = difficulty + 1;
    }

    public void decreaseDifficulty() 
    {
        difficulty = difficulty - 1;
    }

    public void displayStory() 
    {
       //TODO, unsure on meaning of story
    }

    public void exitStory() 
    {
        //TODO, unsire on meaning of story
    }

    public void startLesson() 
    {
        System.out.println("New lesson loading...");
    }

    public void endLesson() 
    {
        System.out.println("Ending lesson...");
    }
}
