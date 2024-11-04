package library;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;
import com.backend.*;

// Written by John
public class FillInTheBlankTests {

    private FillInTheBlank testFillInTheBlankWord;
    private FillInTheBlank testFillInTheBlankPhrase;

    @BeforeEach
    void setUp() {
        Language testLanguage = new Language("Spanish", new WordList(), new PhraseList());
        Word testWord = new Word("brother", "hermano");
        Phrase testPhrase = new Phrase("good night", "beunas noches");

        testFillInTheBlankWord = new FillInTheBlank(testWord);
        testFillInTheBlankPhrase = new FillInTheBlank(testPhrase);
    }

    @AfterEach
    void tearDown() {
        testFillInTheBlankWord = null;
        testFillInTheBlankPhrase = null;
    }

    @Test
    void testAskQuestionWithWord() {
        testFillInTheBlankWord.askQuestion(); // should print the question w/ word
    }

    @Test
    void testCheckAnswerWithCorrectAnswer() {
        assertTrue(testFillInTheBlankWord.checkAnswer("brother"), "answer should be correct");
    }

    @Test
    void testCheckAnswerWithIncorrectAnswer() {
        assertFalse(testFillInTheBlankWord.checkAnswer("goodbye"), "answer should be incorrect");
    }

    @Test
    void testAskQuestionWithPhrase() {
        testFillInTheBlankPhrase.askQuestion(); // This will print the question w/phrase
    }

    @Test
    void testCheckAnswerWithPhraseCorrectAnswer() {
        assertTrue(testFillInTheBlankPhrase.checkAnswer("good night"), "answer should be correct");
    }

    @Test
    void testCheckAnswerWithPhraseIncorrectAnswer() {
        assertFalse(testFillInTheBlankPhrase.checkAnswer("good afternoon"), "answer should be incorrect");
    }
}