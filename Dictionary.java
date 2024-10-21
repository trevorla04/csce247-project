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
        int index = (int) (Math.random() * wordsLearned.size());
        return wordsLearned.getWord(index);
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
