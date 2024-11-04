package library;

import com.backend.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

// Written by John
public class MultipleChoiceTests {

    private Word testWord1;
    private Word testWord2;
    private Phrase testPhrase1;
    private Language testLanguage;
    private MultipleChoice<Object> multipleChoice;

    @BeforeEach
    void setUp() {
        testLanguage = new Language("Spanish", new WordList(), new PhraseList());
        testWord1 = new Word("brother", "hermano");
        testWord2 = new Word("sister", "hermana");
        testPhrase1 = new Phrase("good morning", "buenas dias");

        ArrayList<Object> answerChoices = new ArrayList<>();
        answerChoices.add(testWord1);
        answerChoices.add(testWord2);
        answerChoices.add(testPhrase1);

        multipleChoice = new MultipleChoice<>("Which word translates to 'hermano' in English?", answerChoices, 1); // hermano is correct (index zero)
    }

    @AfterEach
    void tearDown() {
        testWord1 = null;
        testWord2 = null;
        testPhrase1 = null;
        testLanguage = null;
        multipleChoice = null;
    }

    @Test
    void testAskQuestion() {
        multipleChoice.askQuestion(); // should print question along with choices
    }

    @Test
    void testCheckAnswerWithCorrectAnswer() {
        assertTrue(multipleChoice.checkAnswer("1"), "should be true for hermano");
    }

    @Test
    void testCheckAnswerWithIncorrectAnswer() {
        assertFalse(multipleChoice.checkAnswer("2"), "should be incorrect for hermana");
    }

    @Test
    void testCheckAnswerWithInvalidInput() {
        assertFalse(multipleChoice.checkAnswer("xxx"), "input does not match format... should be incorrect");
    }

    @Test
    void testCheckAnswerWithOutOfBoundsInput() {
        assertFalse(multipleChoice.checkAnswer("4"), "not a valid choice, should be incorrect");
    }

    @Test
    void testCheckAnswerWithNullChoice() {
        ArrayList<Object> answerChoices2 = new ArrayList<>();
        answerChoices2.add(testWord1);
        answerChoices2.add(null);
        answerChoices2.add(testPhrase1);

        MultipleChoice<Object> multipleChoiceWithNull = new MultipleChoice<>("Which word translates to 'hermano' in English?", answerChoices2, 1); // hermana is still correct (index one)

        assertFalse(multipleChoiceWithNull.checkAnswer("2"), "checking to see what happens when an answer choice is null... not sure what is supposed to happen");
    }
}