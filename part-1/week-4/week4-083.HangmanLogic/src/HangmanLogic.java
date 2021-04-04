
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens
        if (guessedLetters.contains(letter)) {
            return;
        } else {
            if (!word.contains(letter)) {
                numberOfFaults++;
            }
        }
        guessedLetters += letter;
        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        char[] wordChars = word.toCharArray();
        String hiddenWord = "";
        for (char c : wordChars) {
            if (guessedLetters.contains(String.valueOf(c))) {
                hiddenWord += c;
            } else {
                hiddenWord += "_";
            }
        }
        // return the hidden word at the end
        return hiddenWord;
    }
}
