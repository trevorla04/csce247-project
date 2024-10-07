public class Dictionary {
    
    private List<String> wordsLearned;
    private List<String> phrasesLearned;

    public Dictionary() {
        wordsLearned = new ArrayList<>();
        phrasesLearned = new ArrayList<>();
    }


    public void addWord(String word) {
        wordsLearned.add(word);
    }

    public void addPhrase(String phrase) {
        phrasesLearned.add(phrase);
    }

    public String accessWordOfTheDay() {
        if (wordsLearned.isEmpty()) {
            return "No words learned yet.";
        }
        int index = (int) (Math.random() * wordsLearned.size());
        return wordsLearned.get(index);
    }

    public void removeWord(String word) {
        wordsLearned.remove(word);
    }

    public void removePhrase(String phrase) {
        phrasesLearned.remove(phrase);
    }
}
