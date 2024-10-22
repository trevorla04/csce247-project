package speek.src.main.java.com.backend;

import java.util.ArrayList;
import java.util.UUID;
import java.util.List;

/**
 * Represents a category with a name, associated language, and a unique identifier.
 */
public class Category {
    
    private String name;  /** The name of the category. */
    private Language language;  /** The language associated with the category. */
    private List<Lesson> lessonList;
    private UUID uuid;  /** The unique identifier for the category. */

    /**
     * Constructor to initialize a category with a name, language, and a UUID
     * @param name the name of the category
     * @param language the language asssociated with the category
     */
    public Category(String name, Language language) {
        this.name = name;
        this.language = language;
        this.uuid = UUID.randomUUID();
        this.lessonList = new ArrayList<Lesson>();
    }

    /**
     * Sets the name of the category.
     * @param name the new name for the category
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the category.
     * @return the name of the category
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the language associated with the category.
     * @param language the new language for the category
     */
    public void setLanguage(Language language) {
        this.language = language;
    }

    /**
     * Returns the language associated with the category.
     * @return the language of the category
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Returns the unique identifier of the category
     * @return the UUID of the category
     */
    public UUID getUUID() {
        return uuid;
    }

    public void addLesson(Lesson lesson) {
        lessonList.add(lesson);
    }
}