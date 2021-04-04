
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Up to what number?");
        int last = Integer.parseInt(reader.nextLine());

        int i = 1;
        while (i <= last) {
            System.out.println(i++);
        }
    }
}
