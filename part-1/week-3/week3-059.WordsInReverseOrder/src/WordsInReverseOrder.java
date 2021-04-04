import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        List<String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if (word.isEmpty()) {
                break;
            }
            words.add(word);
        }
        System.out.println("You typed the following words:");
        Collections.reverse(words);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
