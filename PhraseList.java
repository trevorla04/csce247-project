import java.util.List;
import java.util.ArrayList;

public class PhraseList extends Phrase {
    private static PhraseList phraseList;
    private List<Phrase> phrases;

    public PhraseList() {
        phrases = new ArrayList<Phrase>();
    }

    public static PhraseList getInstance() {
        if (phraseList == null) {
            phraseList = new PhraseList();
        }
        return phraseList;
    }

    public void addPhrase(Phrase phrase) {
        if (!phrases.contains(phrase))
            phrases.add(phrase);
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
        for (Phrase phrase: phrases) {
            if(phrase.getPhrase().equalsIgnoreCase(searchPhrase))
                return phrase;
        }
        return null;
    }

    public boolean contains(Phrase cWord) {
        for (Phrase phrase : phrases)
            if (phrases.contains(phrase)) {
                return true;
            }
        return false;
    }

    public boolean isEmpty() {
        return phrases.isEmpty();
    }

    public int getSize() {
        return phrases.size();
    }

    public void printPhrase(int index) {
        System.out.println(phrases.get(index));
    }


    public void clear() {
        for (Phrase phrase : phrases)
            phrases.remove(phrase);
    }

    public void savePhrases() {

    }

    public void loadPhrases() {

    }

}
