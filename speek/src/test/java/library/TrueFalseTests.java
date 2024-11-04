package library;

import com.backend.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Written by Trevor
public class TrueFalseTests {
    private WordList wordList;
    private PhraseList phraseList;
    private Word word;
    private Phrase phrase;
    private Language language;
    private TrueFalse wordQuestion;
    private TrueFalse phraseQuestion;

    @BeforeEach
    public void setup() {
        word = new Word("hello", "hola");
        phrase = new Phrase("Good morning", "buenos dias");

        wordList = new WordList();
        phraseList = new PhraseList();
        phraseList.addPhrase(phrase);
        wordList.addWord(word);

        language = new Language("Spanish", wordList, phraseList);

        wordQuestion = new TrueFalse(word);
        phraseQuestion = new TrueFalse(phrase);
    }

    @Test
    void testCorrectAnswerValidationWordQuestion() {
        assertTrue(wordQuestion.checkAnswer("true") || wordQuestion.checkAnswer("false"),
                "checkAnswer should return true for the correct answer, either 'true' or 'false' depending on the question.");
    }

    @Test
    void testCorrectAnswerValidationPhraseQuestion() {
        assertTrue(phraseQuestion.checkAnswer("true") || phraseQuestion.checkAnswer("false"),
                "checkAnswer should return true for the correct answer, either 'true' or 'false' depending on the question.");
    }

    @Test
    void testIncorrectAnswerValidationWordQuestion() {
        String incorrectAnswer = wordQuestion.checkAnswer("true") ? "false" : "true";
        assertFalse(wordQuestion.checkAnswer(incorrectAnswer), "checkAnswer should return false for an incorrect answer.");
    }

    @Test
    void testIncorrectAnswerValidationPhraseQuestion() {
        String incorrectAnswer = phraseQuestion.checkAnswer("true") ? "false" : "true";
        assertFalse(phraseQuestion.checkAnswer(incorrectAnswer), "checkAnswer should return false for an incorrect answer.");
    }

    @Test
    void testCaseInsensitiveAnswerValidationWordQuestion() {
        String correctAnswer = wordQuestion.checkAnswer("true") ? "true" : "false";
        assertTrue(wordQuestion.checkAnswer(correctAnswer.toUpperCase()), "checkAnswer should be case insensitive.");
    }

    @Test
    void testCaseInsensitiveAnswerValidationPhraseQuestion() {
        String correctAnswer = phraseQuestion.checkAnswer("true") ? "true" : "false";
        assertTrue(phraseQuestion.checkAnswer(correctAnswer.toLowerCase()), "checkAnswer should be case insensitive.");
    }

    @Test
    void testInvalidAnswerValidationWordQuestion() {
        assertFalse(wordQuestion.checkAnswer("yes"), "checkAnswer should return false for an answer that is neither 'true' nor 'false'.");
    }

    @Test
    void testInvalidAnswerValidationPhraseQuestion() {
        assertFalse(phraseQuestion.checkAnswer("no"), "checkAnswer should return false for an answer that is neither 'true' nor 'false'.");
    }

    @Test
    void testRandomnessInQuestionType() {
        boolean foundTrue = false;
        boolean foundFalse = false;
        for (int i = 0; i < 10; i++) {
            TrueFalse randomQuestion = new TrueFalse(word);
            if (randomQuestion.checkAnswer("true")) {
                foundTrue = true;
            } else if (randomQuestion.checkAnswer("false")) {
                foundFalse = true;
            }
            if (foundTrue && foundFalse) break;
        }
        assertTrue(foundTrue && foundFalse, "Randomly generated questions should contain both 'true' and 'false' types over multiple attempts.");
    }
}