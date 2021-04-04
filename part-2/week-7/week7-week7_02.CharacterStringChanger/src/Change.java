public class Change {

    private char fromCharacter;
    private char toCharacter;

    public Change() {
    }

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {

        // Easy way
        /*
        return characterString.replace(fromCharacter, toCharacter);*/

        // We know that the strings are immutable. So we can't change an existing String
        int length = characterString.length();
        char[] changedChars = new char[length];

        for (int i = 0; i < length; i++) {
            if(characterString.charAt(i) == fromCharacter){
                changedChars[i] = toCharacter;
            }
            else {
                changedChars[i] = characterString.charAt(i);
            }
        }

        return String.valueOf(changedChars);
    }
}
