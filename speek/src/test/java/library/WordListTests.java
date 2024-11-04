package library;

import static org.junit.jupiter.api.Assertions.*;

import com.backend.Word;
import com.backend.WordList;
import org.junit.jupiter.api.*;
import java.util.UUID;
import java.util.ArrayList;

// Written by Trevor
public class WordListTests {
    private WordList wordList;
    private Word word1;
    private Word word2;

    @BeforeEach
    public void setup() {
        word1 = new Word("hello", "hola");
        word2 = new Word("now", "ahora");

        wordList = new WordList();
        wordList.addWord(word1);
    }

    @Test
    public void testConstructorInitialization() {
        assertEquals(word1, wordList.getWord(word1.getUUID()));
        assertEquals(word1, wordList.getWord(word1.getWordString()));
        assertNull(wordList.getWord(word2.getUUID()));
        assertNull(wordList.getWord(word2.getWordString()));
    }

    @Test
    public void testAddWordSuccessfully() {
        wordList.addWord(word2);
        assertEquals(word2, wordList.getWord(word2.getUUID()));
        assertEquals(word2, wordList.getWord(word2.getWordString()));
    }

    @Test
    public void testAddDuplicateWord() {
        wordList.addWord(word1); // Attempt to add the same word again
        assertEquals(word1, wordList.getWord(word1.getUUID()));
        assertEquals(word1, wordList.getWord(word1.getWordString()));
    }

    @Test
    public void testRemoveWordSuccessfully() {
        wordList.removeWord(word1);
        assertNull(wordList.getWord(word1.getUUID()));
        assertNull(wordList.getWord(word1.getWordString()));
    }

    @Test
    public void testRemoveNonExistentWord() {
        wordList.removeWord(word2);  // word2 was not initially added
        assertNull(wordList.getWord(word2.getUUID()));
    }

    @Test
    public void testGetWordByUUID() {
        assertEquals(word1, wordList.getWord(word1.getUUID()));
    }

    @Test
    public void testGetWordByString() {
        assertEquals(word1, wordList.getWord(word1.getWordString()));
    }

    @Test
    public void testGetWordNonExistentUUID() {
        assertNull(wordList.getWord(UUID.randomUUID()), "Should return null for a non-existent UUID.");
    }

    @Test
    public void testGetWordNonExistentString() {
        assertNull(wordList.getWord("nonexistent"), "Should return null for a non-existent word string.");
    }

    @Test
    public void testContainsWordByObject() {
        assertTrue(wordList.containsWord(word1));
        assertFalse(wordList.containsWord(word2), "Should return false for a word that hasn't been added.");
    }

    @Test
    public void testContainsWordByString() {
        assertTrue(wordList.containsWord("hello"));
        assertFalse(wordList.containsWord("world"), "Should return false for a word string that hasn't been added.");
    }

    @Test
    public void testGetRandomWord() {
        wordList.addWord(word2);
        Word randomWord = wordList.getRandomWord();
        assertTrue(randomWord.equals(word1) || randomWord.equals(word2), "Random word should be one of the added words.");
    }

    @Test
    public void testGetRandomWordFromEmptyList() {
        wordList.removeWord(word1);  // Remove the only word in the list
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> wordList.getRandomWord(), "Should throw exception when list is empty.");
    }

    @Test
    public void testRemoveWordOnlyUpdatesStringLookup() {
        wordList.removeWord(word1);
        assertNull(wordList.getWord(word1.getWordString()));
        assertEquals(word1, wordList.getWord(word1.getUUID()), "UUID lookup should still contain the word if only string lookup is updated.");
    }

    @Test
    public void testRemoveWordFullyRemovesWord() {
        wordList.addWord(word2);
        wordList.removeWord(word2);
        assertNull(wordList.getWord(word2.getUUID()), "Word should be fully removed from both lookups.");
        assertNull(wordList.getWord(word2.getWordString()));
    }
}
