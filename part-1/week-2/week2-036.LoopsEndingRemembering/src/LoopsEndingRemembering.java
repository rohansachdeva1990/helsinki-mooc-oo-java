import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int number = Integer.parseInt(reader.nextLine());

        int sum = 0;
        int ctr = 0;
        int evenCtr = 0;
        while (number >= 0) {
            ctr++;
            if (number % 2 == 0) {
                evenCtr++;
            }
            sum += number;
            number = Integer.parseInt(reader.nextLine());
        }

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + ctr);
        System.out.println("Average: " + (double) sum / ctr);
        System.out.println("Even numbers: " + evenCtr);
        System.out.println("Odd numbers: " + (ctr - evenCtr));
    }
}
