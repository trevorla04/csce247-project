package com.backend;

import java.util.ArrayList;
import java.util.List;
public class LanguageList {

    // A list of languages managed by this class
    private List<Language> languages ;

    // Constructs an empty object with an empty list of languages
    public LanguageList() {
        this.languages = new ArrayList<>();
    }

    /**
     * Adds a language to the list if it is not already present
     * @param language the to add to the list
     */
    public void addLanguage(Language language) {
        if (!languages.contains(language))
            languages.add(language);
    }

    /**
     * Removes a language from the list if it exists
     * @param language the to remove from the list
     */
    public void removeLanguage(Language language) {
        if (languages.contains(language))
            languages.remove(language);
    }

    /**
     * Retrieves the language at the specified index
     * @param index the index of the language to retrieve
     * @return the {@link Language} at the specified index
     */
    public Language getLanguage(int index) {
        return languages.get(index);
    }

    /**
     * Searches for a language by its name, performing a case-insensitive match
     * @param search the name of the language to search for
     */
    public Language findLanguage(String search) {
        for (Language language : languages) {
            if (language.getName().equalsIgnoreCase(search)) {
                return language;
            }
        }
        return null;
    }

    /**
     * Prints the language at the specified index to the console
     * @param index the index of the language to print
     */
    public void printLanguage(int index) {
        System.out.println(languages.get(index));
    }

    /**
     * Returns the number of languages in the list
     * @return the size of the language list
     */
    public int getSize() {
        return languages.size();
    }

    // Clears the list of languages by removing all entries
    public void clear() {
        for (Language language : languages)
            languages.remove(language);
    }

    // Saves the list of languages
    public void saveLanguage() {

    }

    // Loads the list of languages
    public void loadLanguages() {

    }
}
