package com.backend;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class ScenarioDriver {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        LanguageApplication app = new LanguageApplication();
        //LanguageApplication app = new LanguageApplication(null, null);
        System.out.println("Welcome to Language Learning App");
        int choice = 0;
        while (app.currentUser == null) {
            printLoginOptions();
            choice = keyboard.nextInt();
            keyboard.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter email");
                    String username = keyboard.nextLine();
                    System.out.println("Enter password");
                    String password = keyboard.nextLine();
                    if (app.login(username, password)) {
                        //System.out.println("Successfully logged into: " + username);
                    }
                    break;
                case 2:
                    System.out.println("Enter email address");
                    String emailAddress = keyboard.nextLine();
                    System.out.println("Enter username");
                    String newUsername = keyboard.nextLine();
                    System.out.println("Enter password");
                    String newPassword = keyboard.nextLine();
                    app.createAccount(emailAddress, newUsername, newPassword);
                    DataWriter.saveUsers();
                    break;
                case 3:
                    System.exit(0);
            }
            DataLoader.loadUsers();
        }
        printMenuOptions();
        choice = keyboard.nextInt();
        keyboard.nextLine();
        switch (choice) {
            case 1:
                System.out.println("What language would you like to learn?");
                if (!keyboard.nextLine().equalsIgnoreCase("Spanish"))
                    System.out.println("That language is not supported.");
                else {
                    System.out.println("Loading Spanish language.");
                    break;
                }
                break;
            case 9:
                System.exit(0);
        }
        printModuleOptions();
        double moduleOneScore = 0, moduleTwoScore = 0;
        while (choice != 9) {
            choice = keyboard.nextInt();
            keyboard.nextLine();
            if (choice == 1) {
                greetingsLesson(app, moduleOneScore);
            } else if (choice == 2) {
                if (false)
                    System.out.println("You must first pass module 1.");
                else
                    familyLesson(app, moduleTwoScore);
            } else if (choice == 9) {
                app.logout();
                System.exit(0);
            }
            printModuleOptions();
        }
        app.logout();
    }

    public static void printLoginOptions() {
        System.out.println("1. to login.");
        System.out.println("2. to register an account.");
        System.out.println("9. to exit application.");
    }

    public static void printMenuOptions() {
        System.out.println("1. to a select a language");
        System.out.println("9. to exit application.");
    }

    public static void printModuleOptions() {
        System.out.println("1. to start Module 1: Greetings");
        System.out.println("2. to start Module 2: Family");
        System.out.println("9. to exit application.");
    }

    public static double greetingsLesson(LanguageApplication spanishApp, double scoreCounter) {
        WordList esWordList = new WordList();
        PhraseList esPhraseList = new PhraseList();
        ArrayList<Category> esCategories = new ArrayList<>();
        Language spanish = new Language("Spanish", esWordList, esPhraseList);
        spanishApp.setLanguage(spanish);

        Category greetings = new Category("Greetings", spanish);
        esCategories.add(greetings);
        Lesson greetingsLesson = new Lesson("Greetings Lesson", null,
                greetings, null, null);
        greetings.addLesson(greetingsLesson);

        Word hello = new Word("Hello", null);
        hello.addTranslation(spanish, "hola");
        Phrase goodMorning = new Phrase("Good morning", null);
        goodMorning.addTranslations(spanish, "buenos dias");
        Phrase goodAfternoon = new Phrase("Good afternoon", null);
        goodAfternoon.addTranslations(spanish, "buenos tardes");
        Phrase goodNight = new Phrase("Good night/evening", null);
        goodNight.addTranslations(spanish, "buenas noches");
        Phrase howAreYou = new Phrase("How are you?", null);
        howAreYou.addTranslations(spanish, "Como estas?");

        Flashcard flashcard1 = new Flashcard(hello, spanish);
        Flashcard flashcard2 = new Flashcard(goodMorning, spanish);
        Flashcard flashcard3 = new Flashcard(goodAfternoon, spanish);
        Flashcard flashcard4 = new Flashcard(goodNight, spanish);
        Flashcard flashcard5 = new Flashcard(howAreYou, spanish);

        greetingsLesson.addFlashcard(flashcard1);
        greetingsLesson.addFlashcard(flashcard2);
        greetingsLesson.addFlashcard(flashcard3);
        greetingsLesson.addFlashcard(flashcard4);
        greetingsLesson.addFlashcard(flashcard5);

        ArrayList<Phrase> greetingsList = new ArrayList<Phrase>();
        greetingsList.add(goodMorning);
        greetingsList.add(goodAfternoon);
        greetingsList.add(goodNight);
        greetingsList.add(howAreYou);

        greetingsLesson.addQuestion(new FillInTheBlank(hello, spanish));
        greetingsLesson.addQuestion(new FillInTheBlank(goodMorning, spanish));
        greetingsLesson.addQuestion(new FillInTheBlank(goodAfternoon, spanish));
        greetingsLesson.addQuestion(new MultipleChoice("What does buenos dias mean in English",
                greetingsList, 1));
        greetingsLesson.addQuestion(new TrueFalse(goodNight, spanish));

        greetings.addLesson(greetingsLesson);
        spanish.addCategory(greetings);

        System.out.println("Displaying flashcards for this lesson. Press enter to see the back");
        for (Flashcard flashcard : greetingsLesson.getFlashcards()) {
            System.out.println("Front: " + flashcard.getFront());
            keyboard.nextLine();
            System.out.println("Back: " + flashcard.getBack());
        }

        System.out.println("\nLesson Questions (Must get 4/5 to move on):\n");
        for (Question question : greetingsLesson.getQuestions()) {
            question.askQuestion();
            String userAnswer = keyboard.nextLine();
            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct.");
                scoreCounter++;
            } else
                System.out.println("Incorrect.");
        }

        scoreCounter/=5;
        if (scoreCounter >= 0.8)
            System.out.println("You have passed module 1 with a score of  " + scoreCounter);
        else
            System.out.println("You have not passed module 1 with a score of " + scoreCounter);
        return scoreCounter;
    }

    public static double familyLesson(LanguageApplication spanishApp, double scoreCounter) {
        WordList esWordList = new WordList();
        PhraseList esPhraseList = new PhraseList();
        ArrayList<Category> esCategories = new ArrayList<>();
        Language spanish = new Language("Spanish", esWordList, esPhraseList);
        spanishApp.setLanguage(spanish);

        Category familyWords = new Category("Family Words", spanish);
        esCategories.add(familyWords);
        Lesson familyWordsLesson = new Lesson("Family Lesson", null,
                familyWords, null, null);
        familyWords.addLesson(familyWordsLesson);

        Word dad = new Word("dad", null);
        dad.addTranslation(spanish, "padre");
        Word mom = new Word("mom", null);
        mom.addTranslation(spanish, "madre");
        Word sister = new Word("sister", null);
        sister.addTranslation(spanish, "hermana");
        Word brother = new Word("brother", null);
        brother.addTranslation(spanish, "hermano");
        Word family = new Word("family", null);
        family.addTranslation(spanish, "familia");

        Flashcard flashcard1 = new Flashcard(dad, spanish);
        Flashcard flashcard2 = new Flashcard(mom, spanish);
        Flashcard flashcard3 = new Flashcard(sister, spanish);
        Flashcard flashcard4 = new Flashcard(brother, spanish);
        Flashcard flashcard5 = new Flashcard(family, spanish);

        familyWordsLesson.addFlashcard(flashcard1);
        familyWordsLesson.addFlashcard(flashcard2);
        familyWordsLesson.addFlashcard(flashcard3);
        familyWordsLesson.addFlashcard(flashcard4);
        familyWordsLesson.addFlashcard(flashcard5);

        ArrayList<Word> familyTerms = new ArrayList<Word>();
        familyTerms.add(dad);
        familyTerms.add(mom);
        familyTerms.add(sister);
        familyTerms.add(brother);
        familyTerms.add(family);

        familyWordsLesson.addQuestion(new FillInTheBlank(dad, spanish));
        familyWordsLesson.addQuestion(new FillInTheBlank(mom, spanish));
        familyWordsLesson.addQuestion(new FillInTheBlank(sister, spanish));
        familyWordsLesson.addQuestion(new MultipleChoice("What does hermano mean in English?",
                familyTerms, 4));
        familyWordsLesson.addQuestion(new TrueFalse(family, spanish));

        familyWords.addLesson(familyWordsLesson);
        spanish.addCategory(familyWords);

        System.out.println("Displaying flashcards for this lesson. Press enter to see the back");
        for (Flashcard flashcard : familyWordsLesson.getFlashcards()) {
            System.out.println("Front: " + flashcard.getFront());
            keyboard.nextLine();
            System.out.println("Back: " + flashcard.getBack());
        }

        System.out.println("\nLesson Questions (Must get 4/5 to move on):\n");
        for (Question question : familyWordsLesson.getQuestions()) {
            question.askQuestion();
            String userAnswer = keyboard.nextLine();
            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct.");
                scoreCounter++;
            } else
                System.out.println("Incorrect.");
        }

        scoreCounter/=5;
        if (scoreCounter >= 0.8)
            System.out.println("You have completed module 2 with a score of  " + scoreCounter);
        else
            System.out.println("You have not completed module 2 with a score of " + scoreCounter);
        return scoreCounter;
    }
}
