package com.backend;

import java.util.ArrayList;
import java.util.List;
public class LanguageList {

    private static LanguageList instance;
    // A list of languages managed by this class
    private ArrayList<Language> languages = new ArrayList<>();

    // Constructs an empty object with an empty list of languages
    private LanguageList() {
    }

    public static LanguageList getInstance(){
        if(instance == null){
            instance = new LanguageList();
        }
        return instance;
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

    public ArrayList<Language> getLanguages() {
        return languages;
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


}
