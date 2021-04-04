
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what?");
        int until = Integer.parseInt(reader.nextLine());

        int sum = 0;
        while (until > 0) {
            sum += until--;
        }
        System.out.println("Sum is " + sum);
    }
}
