
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {


    private static boolean guess(int actual, int expected, int count) {
        if (actual < expected) {
            System.out.println("The number is greater, guesses made: " + count);
            return false;
        } else if (actual > expected) {
            System.out.println("The number is lesser, guesses made: " + count);
            return false;
        } else {
            System.out.println("Congratulations, your guess is correct!");
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guessedNumber;
        boolean numberGuessedCorrectly = false;
        int count = 0;
        while (!numberGuessedCorrectly) {
            System.out.print("Guess a number: ");
            guessedNumber = Integer.parseInt(reader.nextLine());
            numberGuessedCorrectly = guess(guessedNumber, numberDrawn, count++);
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
