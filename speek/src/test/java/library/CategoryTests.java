package library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.backend.*;

// Written by Lance
public class CategoryTests {

    private Category category;
    private Language language; // Assuming a Language class exists
    private Lesson lesson1;    // Assuming a Lesson class exists
    private Lesson lesson2;    // Assuming a Lesson class exists

    @BeforeEach
    void setUp() {
        // Initialize a Language and some Lessons for testing
        language = new Language("Spanish", null, null); // Assuming a constructor exists
        lesson1 = new Lesson("Question", null, null, null, null); // Assuming a constructor exists
        lesson2 = new Lesson("Question", null, null, null, null); // Assuming a constructor exists

        // Create a Category instance for testing
        category = new Category("Phrases", language);
    }

    @Test
    void testGetName() {
        assertEquals("Phrases", category.getName(), "The name of the category should be 'Phrases'.");
    }

    @Test
    void testSetName() {
        category.setName("Fill in The Blank");
        assertEquals("Fill in The Blank", category.getName(), "The name of the category should be updated to 'Fill in The Blank'.");
    }

    @Test
    void testGetLanguage() {
        assertEquals(language, category.getLanguage(), "The language of the category should match the initialized language.");
    }

    @Test
    void testSetLanguage() {
        Language newLanguage = new Language("Spanish", null, null); // Assuming a constructor exists
        category.setLanguage(newLanguage);
        assertEquals(newLanguage, category.getLanguage(), "The language of the category should be updated to 'Spanish'.");
    }

    @Test
    void testGetUUID() {
        assertNotNull(category.getUUID(), "The UUID of the category should not be null.");
    }

    @Test
    void testAddLesson() {
        assertEquals(0, category.getLessonList().size(), "The lesson list should be empty initially.");
        category.addLesson(lesson1);
        assertEquals(1, category.getLessonList().size(), "The lesson list should contain 1 lesson after adding lesson1.");
        category.addLesson(lesson2);
        assertEquals(2, category.getLessonList().size(), "The lesson list should contain 2 lessons after adding lesson2.");
    }
}