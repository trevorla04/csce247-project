package com.backend;

public class FillInTheBlank implements Question {
    private String blank;
    private String text;
    public FillInTheBlank(Word word) {
        this.blank = word.getWordString();
        this.text = word.getDefinition();
    }

    public FillInTheBlank(Phrase phrase) {
        this.blank = phrase.getPhraseString();
        this.text = phrase.getDefinition();
    }
    @Override
    public void askQuestion() {
        System.out.println(text+ " means _____");
        com.narriation.Narriator.playSound(text + " means blank");
    }
    @Override
    public boolean checkAnswer(String answer) {
        return this.blank.equalsIgnoreCase(answer);
    }
}
