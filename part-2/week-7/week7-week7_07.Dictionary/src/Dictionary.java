import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Dictionary {

    private HashMap<String, String> translations = new HashMap<String, String>();

    public Dictionary() {
    }

    public void add(String word, String translation) {
        translations.put(word, translation);
    }

    public String translate(String word) {
        return translations.get(word);
    }

    public int amountOfWords() {
        return translations.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationsList = new ArrayList<String>();
        Set<Entry<String, String>> entries = translations.entrySet();
        for (Entry<String, String> entry : entries) {
            translationsList.add(entry.getKey() + " = " + entry.getValue());
        }
        return translationsList;
    }
}
