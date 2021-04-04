
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());

        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());

        if (last < first) {
            return;
        }

        for (int i = first; i <= last; i++){
            System.out.println(i);
        }

    }
}
