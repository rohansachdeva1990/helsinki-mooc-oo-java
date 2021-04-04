
import java.util.Scanner;

public class FirstPart {

    /*
    Type a word: example
Length of the first part: 4
Result: exam
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word: ");
        String word = reader.nextLine();

        System.out.println("Length of the first part: ");
        int len = Integer.parseInt(reader.nextLine());

        String firstPart = extractFirstPart(word, len);
        System.out.println("Result: " + firstPart);

    }

    private static String extractFirstPart(String word, int len) {
        return word.substring(0, len);
    }
}
