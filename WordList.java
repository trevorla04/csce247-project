import java.util.ArrayList;
import java.util.List;

public class WordList extends Word {
    private static WordList words;
    private ArrayList<Word> wordList;

    public WordList() {
        wordList = new ArrayList<>();
    }

    public static WordList getInstance ()
    {
        if (words == null)
        {
            words = new WordList();
        }
        return words;
    }

    public void addWord(Word word) {
        if (!words.contains(word))
            words.add(word);
    }

    public void removeWord(Word word) {
        if (words.contains(word))
            words.remove(word);
    }

    public Word getWord(int index) {
        return words.get(index);
    }

    public Word findWord(String searchWord) {
        for (Word word : words) {
            if (word.getWord().equalsIgnoreCase(searchWord))
                return word;
        }
        return null;
    }

    public int getSize() {
        return words.size();
    }

    public void printWord(int index) {
        System.out.println(words.get(index));
    }

    public void clear() {
        for (Word word : words)
            words.remove(word);
    }

    public boolean contains (String word)
    {
        
        for (Word w : wordList) 
        {
            if (w.equals(word)) 
            {
                return true;
            }
        }
        return false;
    }

    public void saveWord() {

    }

    public void loadWord() {

    }

}
