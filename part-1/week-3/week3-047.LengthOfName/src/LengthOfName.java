
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        // call your method from here
        int numCharacters = calculateCharacters(reader.nextLine());
        System.out.println("Number of characters: " + numCharacters);
    }

    // do here the method
    public static int calculateCharacters(String text) {
        return text.length();
    }
}
