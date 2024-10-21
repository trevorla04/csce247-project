public class Dictionary {

    private WordList wordsLearned;
    private PhraseList phrasesLearned;

    public Dictionary() {
        wordsLearned = new WordList();
        phrasesLearned = new PhraseList();
    }

    // Method to add a word to the dictionary
    public void addWord(String word) {
        if (word != null && !word.isEmpty()) {
            wordsLearned.addWord(word);
        }
    }

    // Method to add a phrase to the dictionary
    public void addPhrase(Phrase phrase) {
        if (phrase != null && !phrase.isEmpty()) {
            phrasesLearned.addPhrase(phrase);
        }
    }

    // Method to access a random word from the dictionary
    public String accessWordOfTheDay() {
        if (wordsLearned.isEmpty()) {
            return "No words learned yet.";
        }
        int index = (int) (Math.random() * wordsLearned.size());
        return wordsLearned.get(index);
    }

    // Method to remove a word from the dictionary
    public void removeWord(String word) {
        wordsLearned.remove(word);
    }

    // Method to remove a phrase from the dictionary
    public void removePhrase(String phrase) {
        phrasesLearned.remove(phrase);
    }

    public List<String> getAllWords() {
        return new ArrayList<>(wordsLearned);
    }

    public List<String> getAllPhrases() {
        return new ArrayList<>(phrasesLearned);
    }
}
