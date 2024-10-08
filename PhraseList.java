import java.util.List;
import java.util.ArrayList;

public class PhraseList extends Phrase {
    private List<Phrase> phrases;

    public PhraseList() {
        phrases = new ArrayList<Phrase>();
    }

    public void addPhrase(Phrase phrase) {
        if (!phrases.contains(phrase))
            phrases.add(phrase)
    }

    public void removePhrase(Phrase phrase) {
        if (phrases.contains(phrase)) {
            phrases.remove(phrase);
        }
    }

    public Phrase getPhrase(int index) {
        return phrases.get(index);
    }

    public Phrase findPhrase(String searchPhrase) {
        for (int i = 0; i < phrases.size(); i++) {
            if (phrases.get(i).phrase.contains(searchPhrase)) {
                return phrases.get(i);
            }
        }
        return null;
    }

    public int getSize() {
        return phrases.size();
    }

    public void printPhrase(int index) {
        System.out.println(phrases.get(index));
    }

    public void clear() {
        for (Phrase phrase : phrases)
            System.out.println(phrase);
    }

    public void savePhrases() {

    }

    public void loadPhrases() {

    }

}
