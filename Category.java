import java.util.UUID;

/**
 * Represents a category with a name, associated language, and a unique identifier.
 */
public class Category {
    
    public String name;  /** The name of the category. */
    public Language language;  /** The language associated with the category. */
    public UUID uuid;  /** The unique identifier for the category. */

    /**
     * Sets the name of the category.
     * @param name the new name for the category
     */
    public void setName(String name) {
        // Set name implementation
    }

    /**
     * Returns the name of the category.
     * @return the name of the category
     */
    public String getName() {
        // Get name implementation
    }

    /**
     * Sets the language associated with the category.
     * @param language the new language for the category
     */
    public void setLanguage(Language language) {
        // Set language implementation
    }

    /**
     * Returns the language associated with the category.
     * @return the language of the category
     */
    public Language getLanguage() {
        // Get language implementation
    }
}