
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first word: ");
        String firstWord = reader.nextLine();

        System.out.println("Type the second word: ");
        String secondWord = reader.nextLine();

        if (firstWord.indexOf(secondWord) >= 0) {
            System.out.println(String.format("The word '%s' is found in the word '%s'", secondWord, firstWord));
        } else {
            System.out.println(String.format("The word '%s' is not found in the word '%s'", secondWord, firstWord));
        }
    }
}
