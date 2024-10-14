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
        //TODO: Method Stub
    }
    public void addWord(String word) {
        //TODO: Method Stub
    }
    public void addLesson(Lesson lesson){
        //TODO: Method Stub
    }
    public Progress calculateProgress(){
        //TODO: Method Stub
    }
    public String getName() {
        return name;
    }

}

