
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.Locale.Category;

public class Lesson {
    private List<Question> questions;
    private Category category;
    private Progress progress;
    private int difficulty;
    private int currentQuestionIndex;

    public Lesson(List<Question> questions, Category category, int difficulty) 
    {
        this.questions = new List<Question>();
        this.category = category;
        this.difficulty = difficulty;
        this.currentQuestionIndex = 0;
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

    public void goToNextQuestion() 
    {
<<<<<<< HEAD
        if(currentQuestionIndex < questions.size()-1)
=======
        if (QuestionIndex < questions.size() - 1)
>>>>>>> 5bf72ead887c90bcc59b0b527c9c0546485773a8
        {
            currentQuestionIndex ++;
            questions(currentQuestionIndex).askQuestion();
        }
        else
        {
            System.out.println("No more questions...");
        }
    }

    public void goToPreviousQuestion() 
    {
        if(currentQuestionIndex > 0)
        {
            currentQuestionIndex --;
            questions(currentQuestionIndex).askQuestion();
        }
        else
        {
            System.out.println("No previous questions...");
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
        //TODO, unsure on meaning of story
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
