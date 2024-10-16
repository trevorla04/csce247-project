import java.util.List;
import java.util.UUID;

public class Language {
    public String name;
    public String abbreviation;
    private WordList wordList;
    private PhraseList phraseList;
    private List<Lesson> lessons;
    private Progress currentProgress;
    private UUID uuid;
    
    // Now the reverse issue, these dont have data types.
    public Language(String name, String abbreviation, WordList wordList, PhraseList phraseList, List<Lesson> lessons){
        this.name = name;
        this.abbreviation = abbreviation;
        this.wordList = wordList;
        this.phraseList = phraseList;
        this.lessons = lessons;
    }
    public void addWord(Word word) {
        wordList.addWord(word);
    }
    public void addLesson(Lesson lesson){
        lessons.add(lesson);
    }
    public Progress calculateProgress(){
        // TODO calc progress
    }
    public String getName() {
        return name;
    }

}

