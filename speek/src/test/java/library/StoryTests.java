package library;

import com.backend.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Written by Trevor
public class StoryTests {
    private Story story;
    private HashMap<Integer, String> content;
    private Language language;
    private WordList keyVocab;
    private List<Question> comprehensionQuestions;
    private Question question;

    @BeforeEach
    public void setup() {
        content = new HashMap<>();
        content.put(1, "Érase una vez...");
        content.put(2, "Ellos vivieron felices para siempre.");
        language = new Language("Spanish", new WordList(), new PhraseList());
        keyVocab = new WordList();
        comprehensionQuestions = new ArrayList<>();
        question = new TrueFalse(new Word("happy", "feliz"));
        comprehensionQuestions.add(question);

        story = new Story("Un Cuento de Hadas", content, language, keyVocab, comprehensionQuestions);
    }

    @Test
    void testStoryConstructorInitializesFieldsCorrectly() {
        assertEquals("Un Cuento de Hadas", story.getTitle(), "The title should be set correctly.");
        assertEquals(content, story.getContent(), "The content should be set correctly.");
        assertEquals(language, story.getLanguage(), "The language should be set correctly.");
        assertEquals(keyVocab, story.getKeyVocab(), "The key vocabulary should be set correctly.");
        assertEquals(comprehensionQuestions, story.getComprehensionQuestions(), "The comprehension questions should be set correctly.");
        assertEquals(2, story.getContent().size(), "The number of pages should match the content size.");
    }

    @Test
    void testSetContentUpdatesNumPages() {
        story.setContent(3, "Test.");
        assertEquals(3, story.getContent().size(), "Content should be updated to include new page.");
        assertEquals(3, story.getComprehensionQuestions().size());
    }

    @Test
    void testAddComprehensionQuestion() {
        Question newQuestion = new TrueFalse(new Word("adventure", "aventura"));
        story.addComprehensionQuestion(newQuestion);
        assertEquals(2, story.getComprehensionQuestions().size(), "A new question should be added.");
        assertTrue(story.getComprehensionQuestions().contains(newQuestion), "The new question should be in the comprehension questions list.");
    }

    @Test
    void testAddComprehensionQuestionNull() {
        int initialSize = story.getComprehensionQuestions().size();
        story.addComprehensionQuestion(null);
        assertEquals(initialSize, story.getComprehensionQuestions().size(), "Adding a null question should not affect the comprehension questions list.");
    }

    @Test
    void testToString() {
        String storyString = story.toString();
        assertTrue(storyString.contains("Title: Un Cuento de Hadas"), "The title should appear in the string representation.");
        assertTrue(storyString.contains("Language: Spanish"), "The language should appear in the string representation.");
        assertTrue(storyString.contains("Number of Pages: 2"), "The number of pages should appear in the string representation.");
        assertTrue(storyString.contains("Key Vocabulary:"), "Key vocabulary should appear in the string representation.");
        assertTrue(storyString.contains("Comprehension Questions:"), "Comprehension questions should appear in the string representation.");
    }
}
