public class Dictionary {

    private List<String> wordsLearned;   
    private List<String> phrasesLearned; 

    public Dictionary() {
        wordsLearned = new ArrayList<>();
        phrasesLearned = new ArrayList<>();
    }

    // Method to add a word to the dictionary
    public void addWord(String word) {
        if (word != null && !word.isEmpty()) {
            wordsLearned.add(word);
        }
    }

    // Method to add a phrase to the dictionary
    public void addPhrase(String phrase) {
        if (phrase != null && !phrase.isEmpty()) {
            phrasesLearned.add(phrase);
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
