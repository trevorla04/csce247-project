package com.backend;

import java.util.HashMap;

public class Progress {
    private HashMap<Category, Integer> categoryProgress;
    private HashMap<Lesson, Integer> lessonProgress;

    /**
     * Constructs a Progress object with initial progress values for categories and lessons
     * @param categoryProgress A map of initial progress values for each category
     * @param lessonProgress   A map of initial progress values for each lesson
     */
    public Progress(HashMap<Category, Integer> categoryProgress, HashMap<Lesson, Integer> lessonProgress) {
        this.categoryProgress = categoryProgress;
        this.lessonProgress = lessonProgress;
    }

    /**
     * Updates the progress for a given category by adding the specified progress value to the current progress. If the category is not yet tracked, it adds the category with the specified progress
     * @param category The category for which progress is being updated
     * @param progress The progress value to add
     */
    public void updateCategoryProgress(Category category, int progress) {
        if (categoryProgress.containsKey(category)) {
            int currentProgress = categoryProgress.get(category);
            categoryProgress.put(category, currentProgress + progress);
        } else {
            categoryProgress.put(category, progress);
        }
    }

    /**
     * Updates the progress for a given lesson by adding the specified progress value to the current progress. If the lesson is not yet tracked, it adds the lesson with the specified progress
     * @param lesson   The lesson for which progress is being updated
     * @param progress The progress value to add
     */
    public void updateLessonProgress(Lesson lesson, int progress) {
        if (lessonProgress.containsKey(lesson)) {
            int currentProgress = lessonProgress.get(lesson);
            lessonProgress.put(lesson, currentProgress + progress);
        } else {
            lessonProgress.put(lesson, progress);
        }
    }

    // Retrieves the current progress for each category
    public HashMap<Category, Integer> getCategoryProgress() {
        return categoryProgress;
    }

    // Retrieves the current progress for each lesson
    public HashMap<Lesson, Integer> getLessonProgress() {
        return lessonProgress;
    }
}
