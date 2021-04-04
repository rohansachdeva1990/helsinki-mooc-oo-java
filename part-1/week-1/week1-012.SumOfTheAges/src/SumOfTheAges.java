
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        String[] userNames = new String[2];
        int sumAges = 0;
        int i = 0;
        while(i < 2){
            System.out.print("Type your name: ");
            userNames[i] = reader.nextLine();

            System.out.print("\nType your age: ");
            sumAges +=  Integer.parseInt(reader.nextLine());
            i++;
        }
        System.out.println(String.format("\n%s and %s are %d years old in total.", userNames[0], userNames[1], sumAges));
    }
}
