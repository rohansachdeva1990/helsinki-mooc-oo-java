
import java.util.Scanner;

public class Divider {

    private int divisor;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        int dividend = Integer.parseInt(reader.nextLine());

        System.out.println("\nType another number: ");
        int divisor = Integer.parseInt(reader.nextLine());

        float division = (float)dividend/ divisor;
        System.out.println(String.format("Division: %d / %d = %f", dividend, divisor, division));
    }
}
