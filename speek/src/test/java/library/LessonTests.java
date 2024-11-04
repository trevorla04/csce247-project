package library;

import com.backend.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Written by Trevor
public class LessonTests {
    private Lesson lesson;
    private List<Question> questions;
    private List<Flashcard> flashcards;
    private Category category;
    private Progress progress;
    private Question question;
    private Flashcard flashcard;
    private Word word;
    private Language spanish;

    @BeforeEach
    public void setup() {
        word = new Word("hello", "hola");
        questions = new ArrayList<>();
        flashcards = new ArrayList<>();
        category = new Category("Beginner", spanish); // Assuming Category has a constructor with a name
        question = new TrueFalse(new Word("hello", "hola"));
        flashcard = new Flashcard(word); // Assuming Flashcard has a constructor with front and back text
        lesson = new Lesson("Spanish Basics", questions, category, null, flashcards);
    }

    @Test
    void testConstructorWithUUID() {
        UUID uuid = UUID.randomUUID();
        Lesson lessonWithUUID = new Lesson("Advanced Spanish", questions, category, progress, flashcards, uuid);
        assertEquals(uuid, lessonWithUUID.getUUID());
    }

    @Test
    void testAddQuestion() {
        lesson.addQuestion(question);
        assertEquals(1, lesson.getQuestions().size());
        assertEquals(question, lesson.getQuestions().get(0));
    }

    @Test
    void testAddNullQuestion() {
        lesson.addQuestion(null);
        assertEquals(0, lesson.getQuestions().size(), "Null questions should not be added.");
    }

    @Test
    void testShowQuestionValidIndex() {
        lesson.addQuestion(question);
        lesson.showQuestion(0);
    }

    @Test
    void testShowQuestionInvalidIndex() {
        lesson.showQuestion(5);
    }

    @Test
    void testGoToNextQuestion() {
        lesson.addQuestion(question);
        lesson.goToNextQuestion();
    }

    @Test
    void testAddFlashcard() {
        lesson.addFlashcard(flashcard);
        assertEquals(1, lesson.getFlashcards().size());
        assertEquals(flashcard, lesson.getFlashcards().get(0));
    }

    @Test
    void testIncreaseDifficulty() {
        lesson.increaseDifficulty(); // Checking for exceptions
    }

    @Test
    void testDecreaseDifficulty() {
        lesson.increaseDifficulty();
        lesson.decreaseDifficulty(); // Checking for exceptions
    }

    @Test
    void testDecreaseDifficultyAtMinimum() {
        lesson.decreaseDifficulty(); // Checking for exceptions
    }

    @Test
    void testDisplayStory() {
        lesson.displayStory(); // Test functionality for story. Story functionality to be added later.
    }

    @Test
    void testExitStory() {
        lesson.exitStory(); // Test functionality for story. Story functionality to be added later.
    }

    @Test
    void testStartLesson() {
        lesson.startLesson(); // Testing just to ensure method works. Not checking for anything in specific.
    }

    @Test
    void testEndLesson() {
        lesson.endLesson(); // Testing just to ensure method works. Not checking for anything in specific.
    }
}