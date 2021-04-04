
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        System.out.print("Type the password: ");
        String userEnteredPassword = reader.nextLine();

        while(!userEnteredPassword.equals(password)){
            System.out.println("Wrong!");
            System.out.println("Type the password: ");
            userEnteredPassword = reader.nextLine();
        }
        System.out.println("Right!");
        System.out.println("The secret is: jryy qbar!");
    }
}
