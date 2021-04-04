package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> wordEntries = new HashMap<String, Set<String>>();

    @Override
    public void add(String word, String entry) {
        if (!wordEntries.containsKey(word)) {
            wordEntries.put(word, new HashSet<String>());
        }
        wordEntries.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        return wordEntries.get(word);
    }

    @Override
    public void remove(String word) {
        wordEntries.put(word, null);
        wordEntries.remove(word);
    }
}
