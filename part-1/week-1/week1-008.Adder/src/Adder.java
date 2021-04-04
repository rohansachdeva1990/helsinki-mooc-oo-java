
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());

        System.out.print("\nType another number: ");
        int num2 = Integer.parseInt(reader.nextLine());

        System.out.println("\nSum of the numbers: " + (num1 + num2));
    }
}
