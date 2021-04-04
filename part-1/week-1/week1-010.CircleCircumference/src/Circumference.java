
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        /**
         * Type the radius: 20
         *
         * Circumference of the circle: 125.66370614359172
         */
        // Program your solution here

        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());

        double circumference = (double) (2 * Math.PI * radius);
        System.out.println("Circumference of the circle: " + circumference);
    }
}
