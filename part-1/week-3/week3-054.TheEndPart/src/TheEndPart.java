import java.util.Scanner;

public class TheEndPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word: ");
        String word = reader.nextLine();

        System.out.println("Length of the end part: ");
        int len = Integer.parseInt(reader.nextLine());

        String endPart = extractEndPart(word, len);
        System.out.println("Result: " + endPart);
    }

    private static String extractEndPart(String word, int len) {
        return word.substring(word.length() - len);
    }
}
