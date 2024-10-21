public class Dictionary {

    private WordList wordsLearned;
    private PhraseList phrasesLearned;

    public Dictionary() {
        wordsLearned = new WordList();
        phrasesLearned = new PhraseList();
    }

    // Method to add a word to the dictionary
    public void addWord(Word word) {
        if (word != null && !wordsLearned.contains(word)) {
            wordsLearned.addWord(word);
        }
    }

    // Method to add a phrase to the dictionary
    public void addPhrase(Phrase phrase) {
        if (phrase != null && !phrasesLearned.contains(phrase)) {
            phrasesLearned.addPhrase(phrase);
        }
    }

    // Method to access a random word from the dictionary
    public Word accessWordOfTheDay() {
        if (wordsLearned.isEmpty()) {
            System.out.println("No words learned yet.");
            return null;
        }
        int index = (int) (Math.random() * wordsLearned.getSize());
        return wordsLearned.getWord(index);
    }

    // Method to remove a word from the dictionary
    public void removeWord(Word word) {
        wordsLearned.removeWord(word);
    }

    // Method to remove a phrase from the dictionary
    public void removePhrase(Phrase phrase) {
        phrasesLearned.removePhrase(phrase);
    }

    public WordList getAllWords() {
        return wordsLearned;
    }

    public PhraseList getAllPhrases() {
        return phrasesLearned;
    }
}
