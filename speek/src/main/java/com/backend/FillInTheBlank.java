package com.backend;

public class FillInTheBlank implements Question {
    private String blank;
    private String text;
    public FillInTheBlank(Word word, Language language) {
        this.blank = word.getWordString();
        this.text = word.getTranslation(language);
    }

    public FillInTheBlank(Phrase phrase, Language language) {
        this.blank = phrase.getPhraseString();
        this.text = phrase.getTranslation(language);
    }
    @Override
    public void askQuestion() {
        System.out.println(text+ " means _____");
    }
    @Override
    public boolean checkAnswer(String answer) {
        return this.blank.equalsIgnoreCase(answer);
    }
}
