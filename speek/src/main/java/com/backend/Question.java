package com.backend;

public interface Question {

    String getType();

    String askQuestion();

    boolean checkAnswer(String answer);

}