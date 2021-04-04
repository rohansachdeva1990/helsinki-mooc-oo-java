package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> uniqueStrings = new HashSet<String>();
    private int numDetectedDuplicates = 0;

    @Override
    public void add(String characterString) {
        boolean isAdded = uniqueStrings.add(characterString);
        if (!isAdded) {
            numDetectedDuplicates++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return numDetectedDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return uniqueStrings;
    }

    @Override
    public void empty() {
        uniqueStrings.clear();
        numDetectedDuplicates = 0;
    }
}
