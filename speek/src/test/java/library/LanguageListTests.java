package library;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.UUID;
import com.backend.*;

// Written by Trevor
public class LanguageListTests {
    private LanguageList languageList;
    private Language language1;
    private Language language2;

    @BeforeEach
    public void setup() {
        languageList = LanguageList.getInstance();
        languageList.getLanguages().clear();

        WordList spanishWordList = new WordList();
        PhraseList spanishPhraseList = new PhraseList();
        WordList frenchWordList = new WordList();
        PhraseList frenchPhraseList = new PhraseList();

        // Initialize languages with unique names and lists
        language1 = new Language("Spanish", spanishWordList, spanishPhraseList);
        language2 = new Language("French", frenchWordList, frenchPhraseList);
    }

    @AfterEach
    public void tearDown() {
        languageList.getLanguages().clear();
    }

    @Test
    void testAddLanguageSuccessfully() {
        languageList.addLanguage(language1);
        assertEquals(1, languageList.getLanguages().size());
        assertEquals(language1, languageList.getLanguages().get(0));
    }

    @Test
    void testAddDuplicateLanguage() {
        languageList.addLanguage(language1);
        languageList.addLanguage(language1);  // Attempt to add the same language again
        assertEquals(1, languageList.getLanguages().size(), "Duplicate language should not be added.");
    }

    @Test
    void testRemoveLanguageSuccessfully() {
        languageList.addLanguage(language1);
        languageList.removeLanguage(language1);
        assertEquals(0, languageList.getLanguages().size(), "Language should be removed successfully.");
    }

    @Test
    void testRemoveNonExistentLanguage() {
        languageList.addLanguage(language1);
        languageList.removeLanguage(language2);  // Attempt to remove a language not in the list
        assertEquals(1, languageList.getLanguages().size(), "Removing a non-existent language should not affect the list.");
    }

    @Test
    void testGetLanguageByIndexValid() {
        languageList.addLanguage(language1);
        languageList.addLanguage(language2);
        assertEquals(language1, languageList.getLanguage(0));
        assertEquals(language2, languageList.getLanguage(1));
    }

    @Test
    void testGetLanguageByIndexInvalid() {
        languageList.addLanguage(language1);
        assertThrows(IndexOutOfBoundsException.class, () -> languageList.getLanguage(1), "Invalid index should throw IndexOutOfBoundsException.");
    }

    @Test
    void testFindLanguageByNameValid() {
        languageList.addLanguage(language1);
        languageList.addLanguage(language2);
        assertEquals(language1, languageList.findLanguage("Spanish"));
        assertEquals(language2, languageList.findLanguage("French"));
    }

    @Test
    void testFindLanguageByNameCaseInsensitive() {
        languageList.addLanguage(language1);
        assertEquals(language1, languageList.findLanguage("spanish"), "Search should be case-insensitive.");
    }

    @Test
    void testFindLanguageByNameInvalid() {
        languageList.addLanguage(language1);
        assertNull(languageList.findLanguage("German"), "Non-existent language should return null.");
    }
}
