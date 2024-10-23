package com.backend;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/**
 * Represents a story with a title, content, language, key vocabulary, 
 * and comprehension questions.
 */
public class Story {
    
    private String title;  /** The title of the story. */
    private HashMap<Integer, String> content = new HashMap<>();  /** The content of the story, mapped by page numbers. */
    private Language language;  /** The language in which the story is written. */
    private WordList keyVocab;  /** The key vocabulary used in the story. */
    private List<Question> comprehensionQuestions = new ArrayList<>();  /** The comprehension questions related to the story. */
    private int numPages;  /** The number of pages in the story. */

    /**
     * Constructs a new Story with the specified title, content, language,
     * key vocabulary, and comprehension questions.
     * @param title the title of the story
     * @param content a map of page numbers to content strings
     * @param language the language of the story
     * @param keyVocab the key vocabulary associated with the story
     * @param comprehensionQuestions a list of questions for comprehension
     */
    public Story(String title, HashMap<Integer, String> content, Language language, WordList keyVocab, List<Question> comprehensionQuestions) {
        this.title = title;
        this.content = content;
        this.language = language;
        this.keyVocab = keyVocab;
        this.comprehensionQuestions = comprehensionQuestions;
        this.numPages = content.size();
    }

    /**
     * Returns the title of the story.
     * @return the title of the story
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the story.
     * @param title the new title for the story
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the content of the story.
     * @return a map of page numbers to content strings
     */
    public HashMap<Integer, String> getContent() {
        return content;
    }

    /**
     * Sets the content for a specific page in the story.
     * @param pageNumber the page number to set content for
     * @param content the content string for the specified page
     */
    public void setContent(int pageNumber, String content) {
        this.content.put(pageNumber, content);
        this.numPages = Math.max(this.numPages, pageNumber);
    }

    /**
     * Returns the language of the story.
     * @return the language of the story
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Sets the language of the story.
     * @param language the new language for the story
     */
    public void setLanguage(Language language) {
        this.language = language;
    }

    /**
     * Returns the key vocabulary associated with the story.
     * @return the key vocabulary
     */
    public WordList getKeyVocab() {
        return keyVocab;
    }

    /**
     * Adds key vocabulary to the story.
     * @param keyVocab the key vocabulary to be added
     */
    /*public void addKeyVocab(WordList keyVocab) {
        this.keyVocab.addAll(keyVocab);
    }*/

    /**
     * Returns the list of comprehension questions related to the story.
     * @return a list of comprehension questions
     */
    public List<Question> getComprehensionQuestions() {
        return comprehensionQuestions;
    }

    /**
     * Adds a comprehension question to the story.
     * @param question the question to be added
     */
    public void addComprehensionQuestion(Question question) {
        comprehensionQuestions.add(question);
    }

    /**
     * Returns a string representation of the story.
     * @return a string containing the title and other story details
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(title).append("\n").append("Language: ").append(language).append("\n").append("Number of Pages: ").append(numPages).append("\n").append("Key Vocabulary: ").append(keyVocab).append("\n").append("Comprehension Questions: ").append(comprehensionQuestions).append("\n");
        return sb.toString();
    }
}