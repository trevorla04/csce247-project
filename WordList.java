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
            words.addWord(word);
    }

    public void removeWord(Word word) {
        if (words.contains(word))
            words.removeWord(word);
    }

    public Word getWord(int index) {
        return words.getWord(index);
    }

    public Word findWord(String searchWord) {
        for (Word word : wordList) {
            if (word.getWord().equalsIgnoreCase(searchWord))
                return word;
        }
        return null;
    }

    public int getSize() {
        return words.getSize();
    }

    public void printWord(int index) {
        System.out.println(words.getWord(index));
    }

    public void clear() {
        for (Word word : wordList)
            words.removeWord(word);
    }

    public boolean contains (Word word)
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

    public boolean isEmpty ()
    {
        if(this.getSize() == 0)
        {
            return true;
        }
        return false;
    }

}
