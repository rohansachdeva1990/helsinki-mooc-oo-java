import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> changes = new ArrayList<Change>();

    public Changer() {
    }

    public void addChange(Change change) {
        this.changes.add(change);
    }

    public String change(String characterString) {
        for (Change _change : changes) {
            characterString = _change.change(characterString);
        }
        return characterString;
    }
}
