package library;

import com.backend.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Written by Trevor
public class FlashcardTests {
    private Flashcard wordFlashcard;
    private Flashcard phraseFlashcard;
    private Word word;
    private Phrase phrase;

    @BeforeEach
    public void setup() {
        word = new Word("hello", "hola");
        phrase = new Phrase("Good morning", "buenos dias");
        wordFlashcard = new Flashcard(word);
        phraseFlashcard = new Flashcard(phrase);
    }

    @Test
    void testFlashcardCreationFromWord() {
        assertEquals("hello", wordFlashcard.getFront(), "The front of the flashcard should be wordString.");
        assertEquals("hola", wordFlashcard.getBack(), "The back of the flashcard should be the wordDefinition.");
    }

    @Test
    void testFlashcardCreationFromPhrase() {
        assertEquals("Good morning", phraseFlashcard.getFront(), "The front of the flashcard should be phraseString.");
        assertEquals("buenos dias", phraseFlashcard.getBack(), "The back of the flashcard should be definition.");
    }

    @Test
    void testFlashcardHandlesNullWord() {
        Word nullWord = new Word(null, null);
        Flashcard nullWordFlashcard = new Flashcard(nullWord);
        assertNull(nullWordFlashcard.getFront(), "The front should be null if wordString is null.");
        assertNull(nullWordFlashcard.getBack(), "The back should be null if definition is null.");
    }

    @Test
    void testFlashcardHandlesNullPhrase() {
        Phrase nullPhrase = new Phrase(null, null);
        Flashcard nullPhraseFlashcard = new Flashcard(nullPhrase);
        assertNull(nullPhraseFlashcard.getFront(), "The front should be null if phraseString is null.");
        assertNull(nullPhraseFlashcard.getBack(), "The back should be null if definition is null.");
    }

    @Test
    void testFlashcardWithEmptyStringWord() {
        Word emptyWord = new Word("", "");
        Flashcard emptyWordFlashcard = new Flashcard(emptyWord);
        assertEquals("", emptyWordFlashcard.getFront(), "The front should be an empty string if wordString is empty.");
        assertEquals("", emptyWordFlashcard.getBack(), "The back should be an empty string if definition is empty.");
    }

    @Test
    void testFlashcardWithEmptyStringPhrase() {
        Phrase emptyPhrase = new Phrase("", "");
        Flashcard emptyPhraseFlashcard = new Flashcard(emptyPhrase);
        assertEquals("", emptyPhraseFlashcard.getFront(), "The front should be an empty string if phraseString is empty.");
        assertEquals("", emptyPhraseFlashcard.getBack(), "The back should be an empty string if definition is empty.");
    }
}
