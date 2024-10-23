package com.backend;

import java.util.HashMap;

public class Progress {
    private HashMap<Category, Integer> categoryProgress;
    private HashMap<Lesson, Integer> lessonProgress;

    public Progress(HashMap<Category, Integer> categoryProgress, HashMap<Lesson, Integer> lessonProgress) {
        this.categoryProgress = categoryProgress;
        this.lessonProgress = lessonProgress;
    }

    public void updateCategoryProgress(Category category, int progress) {
        if (categoryProgress.containsKey(category)) {
            int currentProgress = categoryProgress.get(category);
            categoryProgress.put(category, currentProgress + progress);
        } else {
            categoryProgress.put(category, progress);
        }
    }

    public void updateLessonProgress(Lesson lesson, int progress) {
        if (lessonProgress.containsKey(lesson)) {
            int currentProgress = lessonProgress.get(lesson);
            lessonProgress.put(lesson, currentProgress + progress);
        } else {
            lessonProgress.put(lesson, progress);
        }
    }

    public HashMap<Category, Integer> getCategoryProgress() {
        return categoryProgress;
    }

    public HashMap<Lesson, Integer> getLessonProgress() {
        return lessonProgress;
    }
}
