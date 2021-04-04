import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();

        System.out.println("Type numbers:");
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            stats.addNumber(number);
            if (number % 2 == 0) {
                evenStats.addNumber(number);
            } else {
                oddStats.addNumber(number);
            }
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even : " + evenStats.sum());
        System.out.println("sum of odd: " + oddStats.sum());
    }
}
