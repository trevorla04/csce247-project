import java.util.List;
import java.util.ArrayList;

public class PhraseList extends Phrase {
    private static PhraseList phrases;
    private List<Phrase> phraseList;

    public PhraseList() {
        phraseList = new ArrayList<Phrase>();
    }

    public static PhraseList getInstance() {
        if (phrases == null) {
            phrases = new PhraseList();
        }
        return phrases;
    }

    public void addPhrase(Phrase phrase) {
        if (!phrases.contains(phrase))
            phrases.addPhrase(phrase);
    }

    public void removePhrase(Phrase phrase) {
        if (phrases.contains(phrase)) {
            phrases.removePhrase(phrase);
        }
    }

    public Phrase getPhrase(int index) {
        return phrases.get(index);
    }

    public Phrase findPhrase(String searchPhrase) {
        for (Phrase phrase: phraseList) {
            if(phrase.getPhrase().equalsIgnoreCase(searchPhrase))
                return phrase;
        }
        return null;
    }

    public boolean contains(Phrase cWord) {
        for (Phrase phrase : phraseList)
            if (phrases.contains(phrase)) {
                return true;
            }
        return false;
    }

    public boolean isEmpty() {
        return phrases.isEmpty();
    }

    public int getSize() {
        return phrases.getSize();
    }

    public void printPhrase(int index) {
        System.out.println(phrases.getPhrase(index));
    }


    public void clear() {
        for (Phrase phrase : phraseList)
            phrases.removePhrase(phrase);
    }

    public void savePhrases() {

    }

    public void loadPhrases() {

    }

}
