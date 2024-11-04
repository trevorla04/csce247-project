package com.backend;

import java.util.Random;
public class TrueFalse implements Question {
    private Random r = new Random();
    private String question;
    private String correctAnswer;
    public TrueFalse(Word word) {
        int questionType = r.nextInt(1);
        if(questionType == 0) {
            this.question = "True or false? " + word.getWordString() + " translates to " + word.getDefinition();
            correctAnswer = "true";
        }
        else {
            this.question = "True or false? " + word.getWordString() + " does not translate to " + word.getDefinition();
            correctAnswer = "false";
        }
    }

    public TrueFalse(Phrase phrase) {
        int questionType = r.nextInt(1);
        if(questionType == 0) {
            this.question = "True or false? " + phrase.getPhraseString() + " translates to " + phrase.getDefinition();
            correctAnswer = "true";
        }
        else {
            this.question = "True or false? " + phrase.getPhraseString() + " does not translate to " + phrase.getDefinition();
            correctAnswer = "false";
        }
    }

    @Override
    public void askQuestion() {
        System.out.println(question);
        com.narriation.Narriator.playSound(question);
    }

    @Override
    public boolean checkAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }

}
