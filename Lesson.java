import java.util.ArrayList;
import java.util.List;

/**
 * The Lesson class represents an educational lesson that contains a series of questions.
 * It manages the lesson’s questions, difficulty level, and progress, and provides methods to start, end, and navigate lessons.
 */
public class Lesson {
    
    /** List of questions in the lesson. */
    private List<Question> questions;
    
    /** The category of the lesson. */
    private Category category;
    
    /** Tracks the progress within the lesson. */
    private Progress progress;
    
    /** The difficulty level of the lesson. */
    private int difficulty;

    /**
     * Adds a question to the lesson.
     *
     * @param question the Question to be added
     */
    public void addQuestion(Question question) {
        if (question != null) {
            questions.add(question);
        }
    }

    /**
     * Adds a learned word to a dictionary.
     *
     * @param word the Word to add
     * @param dictionary the Dictionary to which the word will be added
     */
    public void addLearnedWord(Word word, Dictionary dictionary) {
        if (word != null && dictionary != null) {
            dictionary.addWord(word);
        }
    }

    /**
     * Displays a question if it exists in the lesson.
     *
     * @param question the Question to show
     */
    public void showQuestion(Question question) {
        if (questions.contains(question)) {
            System.out.println("Question: " + question.getText());
        } else {
            System.out.println("Question not found in the lesson.");
        }
    }

    /** Moves to the next lesson. */
    public void goToNextLesson() {
        System.out.println("Going to the next lesson...");
    }

    /** Moves to the previous lesson. */
    public void goToPreviousLesson() {
        System.out.println("Going to the previous lesson...");
    }

    /** Increases the lesson difficulty by one level. */
    public void increaseDifficulty() {
        difficulty++;
        System.out.println("Increased difficulty to " + difficulty);
    }

    /**
     * Decreases the lesson difficulty by one level if above minimum level.
     */
    public void decreaseDifficulty() {
        if (difficulty > 1) {
            difficulty--;
            System.out.println("Decreased difficulty to " + difficulty);
        } else {
            System.out.println("Difficulty cannot be decreased further.");
        }
    }

    /** Displays the story associated with the lesson. */
    public void displayStory() {
        System.out.println("Displaying the story...");
    }

    /** Exits the story display. */
    public void exitStory() {
        System.out.println("Exiting the story...");
    }

    /** Starts the lesson. */
    public void startLesson() {
        System.out.println("Starting the lesson...");
    }

    /** Ends the lesson. */
    public void endLesson() {
        System.out.println("Ending the lesson...");
    }

    /**
     * Represents a question with text content.
     */
    class Question {
        private String text;

        /**
         * Constructs a Question with the specified text.
         *
         * @param text the text of the question
         */
        public Question(String text) {
            this.text = text;
        }

        /**
         * Gets the text of the question.
         *
         * @return the question text
         */
        public String getText() {
            return text;
        }
    }

    /**
     * Represents a word that can be added to a dictionary.
     */
    class Word {
        private String word;

        /**
         * Constructs a Word with the specified text.
         *
         * @param word the text of the word
         */
        public Word(String word) {
            this.word = word;
        }

        /**
         * Gets the word text.
         *
         * @return the word text
         */
        public String getWord() {
            return word;
        }
    }

    /**
     * Represents a dictionary of words.
     */
    class Dictionary {
        private List<Word> words;

        /** Constructs an empty Dictionary. */
        public Dictionary() {
            words = new ArrayList<>();
        }

        /**
         * Adds a word to the dictionary.
         *
         * @param word the Word to add
         */
        public void addWord(Word word) {
            if (word != null) {
                words.add(word);
            }
        }

        /**
         * Gets the list of words in the dictionary.
         *
         * @return the list of words
         */
        public List<Word> getWords() {
            return words;
        }
    }

    /**
     * Represents the category of the lesson.
     */
    class Category {
        private String name;

        /**
         * Constructs a Category with the specified name.
         *
         * @param name the name of the category
         */
        public Category(String name) {
            this.name = name;
        }

        /**
         * Gets the category name.
         *
         * @return the category name
         */
        public String getName() {
            return name;
        }
    }

    /**
     * Tracks progress within the lesson.
     */
    class Progress {
        private int currentQuestionIndex;

        /** Constructs a Progress object starting at the first question. */
        public Progress() {
            this.currentQuestionIndex = 0;
        }

        /**
         * Gets the current question index.
         *
         * @return the index of the current question
         */
        public int getCurrentQuestionIndex() {
            return currentQuestionIndex;
        }

        /** Advances to the next question. */
        public void nextQuestion() {
            currentQuestionIndex++;
        }

        /** Moves to the previous question if not at the beginning. */
        public void previousQuestion() {
            if (currentQuestionIndex > 0) {
                currentQuestionIndex--;
            }
        }
    }
}
