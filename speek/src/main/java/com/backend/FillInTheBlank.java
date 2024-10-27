package com.backend;

public class FillInTheBlank implements Question {

    @Override
    public String getType() {
        return "";
    }

    @Override
    public void askQuestion() {

    }

    @Override
    public boolean checkAnswer(String answer) {
        return false;
    }
}
