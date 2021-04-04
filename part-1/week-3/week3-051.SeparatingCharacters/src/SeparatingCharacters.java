
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();

        final String outputFormat = "%d. character: %c";
        int i = 0;
        while (i < name.length()) {
            System.out.println(String.format(outputFormat, i + 1, name.charAt(i)));
            i++;
        }
    }
}
