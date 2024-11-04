package library;

import com.backend.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Written by Lance
public class DictionaryTests {

    private Dictionary dictionary;
    private WordList wordsLearned;
    private PhraseList phrasesLearned;
    private Word word1;
    private Word word2;
    private Phrase phrase1;
    private Phrase phrase2;

    @BeforeEach
    void setUp() {
        // Initialize the dictionary and its lists
        wordsLearned = new WordList();
        phrasesLearned = new PhraseList();
        dictionary = new Dictionary();

        // Create words and phrases for testing
        word1 = new Word("Hello", "Hola");
        word2 = new Word("Goodbye", "Adiós");
        phrase1 = new Phrase("How are you?", "¿Cómo estás?");
        phrase2 = new Phrase("See you later", "Hasta luego");
    }

    @Test
    void testAddWord() {
        // Add words to the dictionary
        dictionary.addWord(word1);
        dictionary.addWord(word2);

        // Test if words are added correctly
        assertEquals(2, dictionary.getAllWords().getSize(), "Should have 2 words after adding.");
    }

    @Test
    void testAddPhrase() {
        // Add phrases to the dictionary
        dictionary.addPhrase(phrase1);
        dictionary.addPhrase(phrase2);

        // Test if phrases are added correctly
        assertEquals(2, dictionary.getAllPhrases().getSize(), "Should have 2 phrases after adding.");
    }

    @Test
    void testAccessWordOfTheDayWhenEmpty() {
        Dictionary emptyDictionary = new Dictionary();
        assertNull(emptyDictionary.accessWordOfTheDay(), "Should return null if there are no words learned.");
    }

    @Test
    void testAccessWordOfTheDay() {
        // Add words to the dictionary
        dictionary.addWord(word1);
        dictionary.addWord(word2);

        Word wordOfTheDay = dictionary.accessWordOfTheDay();
        assertNotNull(wordOfTheDay, "Should return a word of the day when there are words learned.");
        assertTrue(word1.equals(wordOfTheDay) || word2.equals(wordOfTheDay), "Word of the day should be one of the added words.");
    }

    @Test
    void testRemoveWord() {
        // Add words to the dictionary
        dictionary.addWord(word1);
        dictionary.addWord(word2);

        // Remove a word
        dictionary.removeWord(word1);
        assertEquals(1, dictionary.getAllWords().getSize(), "Should have 1 word after removing word1.");
    }

    @Test
    void testRemovePhrase() {
        // Add phrases to the dictionary
        dictionary.addPhrase(phrase1);
        dictionary.addPhrase(phrase2);

        // Remove a phrase
        dictionary.removePhrase(phrase1);
        assertEquals(1, dictionary.getAllPhrases().getSize(), "Should have 1 phrase after removing phrase1.");
    }

    @Test
    void testRemoveWordOfTheDay() {
        // Add a word and set it as the word of the day
        dictionary.addWord(word1);
        dictionary.accessWordOfTheDay(); // Set the word of the day
        dictionary.removeWord(word1); // Remove the word
        assertNull(dictionary.accessWordOfTheDay(), "Should return null after removing the word of the day.");
    }

    @Test
    void testGetAllWords() {
        dictionary.addWord(word1);
        dictionary.addWord(word2);
        assertEquals(wordsLearned, dictionary.getAllWords(), "Should return the same WordList.");
    }

    @Test
    void testGetAllPhrases() {
        dictionary.addPhrase(phrase1);
        dictionary.addPhrase(phrase2);
        assertEquals(phrasesLearned, dictionary.getAllPhrases(), "Should return the same PhraseList.");
    }
}