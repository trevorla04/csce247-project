package com.backend;

import java.util.HashMap;
import java.util.UUID;

public class Progress {
    private HashMap<UUID, Integer> categoryProgress = new HashMap<UUID, Integer>();
    private HashMap<UUID, Integer> lessonProgress = new HashMap<UUID, Integer>();

    /**
     * Constructs a Progress object with initial progress values for categories and lessons
     * @param categoryProgress A map of initial progress values for each category
     * @param lessonProgress   A map of initial progress values for each lesson
     */



    public Progress(HashMap<Category, Integer> categoryProgress, HashMap<Lesson, Integer> lessonProgress) {


        for(Object key: categoryProgress.keySet().toArray()){
            this.categoryProgress.put(((Category) key).getUUID(),categoryProgress.get(key));
        }
        for(Object key:lessonProgress.keySet().toArray()){
            this.lessonProgress.put(((Lesson) key).getUUID(),lessonProgress.get(key));
        }
    }
    public Progress(HashMap<UUID,Integer> categoryProgress, HashMap<UUID,Integer> lessonProgress, boolean why){
        // The boolean parameter only exists to differentiate these two constructors because java
        // apparently cant tell the difference between 2 typed hashmaps? unfun.
        // goes unused so go wild with your values. True? False? doesnt matter.

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
