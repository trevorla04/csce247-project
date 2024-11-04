package library;

import com.backend.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.UUID;

// Written by John
public class PhraseListTests {

    private PhraseList phraseList;
    private Phrase testPhrase1;
    private Phrase testPhrase2;

    @BeforeEach
    void setUp() {
        phraseList = new PhraseList();
        testPhrase1 = new Phrase("good morning", "buenos dias", UUID.randomUUID());
        testPhrase2 = new Phrase("good afternoon", "buenos tardes", UUID.randomUUID());
    }

    @AfterEach
    void tearDown() {
        phraseList = null;
        testPhrase1 = null;
        testPhrase2 = null;
    }

    @Test
    void testAddPhrase() {
        phraseList.addPhrase(testPhrase1);
        assertEquals(1, phraseList.getSize(), "should equal 1, which is the size of the phraselist");
    }

    @Test
    void testAddDuplicatePhrase() {
        phraseList.addPhrase(testPhrase1);
        phraseList.addPhrase(testPhrase1);
        assertEquals(1, phraseList.getSize(), "size should equal 1, two of the same phrases added");
    }

    @Test
    void testRemovePhrase() {
        phraseList.addPhrase(testPhrase1);
        phraseList.removePhrase(testPhrase1);
        assertEquals(0, phraseList.getSize(), "size should be 0. test phrase 1 was added and them removed");
    }

    @Test
    void testRemoveNonExistentPhrase() {
        phraseList.addPhrase(testPhrase1);
        phraseList.removePhrase(testPhrase2);
        assertEquals(1, phraseList.getSize(), "size should be 1. nothing in the list was removed");
    }

    @Test
    void testGetPhraseWithValidIndex() {
        phraseList.addPhrase(testPhrase1);
        assertEquals(testPhrase1, phraseList.getPhrase(0), "should return phrase 1");
    }

    @Test
    void testGetPhraseWithInvalidIndex() {
        assertNull(phraseList.getPhrase(0), "should be null. not a real index");
    }

    @Test
    void testFindPhraseWithExistingPhrase() {
        phraseList.addPhrase(testPhrase1);
        assertEquals(testPhrase1, phraseList.findPhrase("good morning"), "find Phrase should return phrase 1");
    }

    @Test
    void testFindPhraseWithNonExistentPhrase() {
        assertNull(phraseList.findPhrase("blah blah"), "should be null. blah blah doesnt exist");
    }

    @Test
    void testContainsWithExistingPhrase() {
        phraseList.addPhrase(testPhrase1);
        assertTrue(phraseList.contains(testPhrase1), "contains should return true for phrase 1. phrase 1 added to list");
    }

    @Test
    void testContainsWithNonExistentPhrase() {
        assertFalse(phraseList.contains(testPhrase1), "should be phalse. phrase 1 never was added");
    }

    @Test
    void testIsEmptyWhenListIsEmpty() {
        assertTrue(phraseList.isEmpty(), "should return true. nothing added");
    }

    @Test
    void testIsEmptyWhenListIsNotEmpty() {
        phraseList.addPhrase(testPhrase1);
        assertFalse(phraseList.isEmpty(), "should be false. phrase 1 was added");
    }

    @Test
    void testClear() {
        phraseList.addPhrase(testPhrase1);
        phraseList.clear();
        assertTrue(phraseList.isEmpty(), "should be true. list was cleared.");
    }
}