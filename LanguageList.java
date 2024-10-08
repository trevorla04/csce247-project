import java.util.ArrayList;
import java.util.List;
public class LanguageList {

    private List<Language> languages ;

    public LanguageList() {
        this.languages = new ArrayList<>();
    }

    public void addLanguage(Language language) {
        if (!languages.contains(language))
            languages.add(language);
    }

    public void removeLanguage(Language language) {
        if (languages.contains(language))
            languages.remove(language);
    }

    public Language getLanguage(int index) {
        return languages.get(index);
    }

    public Language findLanguage(String search) {
        for (int i = 0; i < languages.size(); i++) {
            if (languages.get(i).) {
                return languages.get(i);
            }
        }
        return null;
    }

    public void printLanguage(int index) {
        System.out.println(languages.get(index));
    }

    public int getSize() {
        return languages.size();
    }

    public void clear() {
        for (Language language : languages)
            languages.remove(language);
    }

    public void saveLanguage() {

    }

    public void loadLanguages() {

    }
}
