import java.util.UUID;

/**
 * Represents a category with a name, associated language, and a unique identifier.
 */
public class Category {
    
    public String name;  /** The name of the category. */
    public Language language;  /** The language associated with the category. */
    public UUID uuid;  /** The unique identifier for the category. */

    /**
     * Constructor to initialize a category with a name, language, and a UUID
     * @param name the name of the category
     * @param language the language asssociated with the category
     */
    public Category(String name, Language language) {
        this.name = name;
        this.language = language;
        this.uuid = UUID.randomUUID();
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
}