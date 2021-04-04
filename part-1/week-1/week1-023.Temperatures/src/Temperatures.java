
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while(true){
            double point = Double.parseDouble(reader.nextLine());
            if(point < -30 || point > 40){
                continue;
            }
            Graph.addNumber(point);
        }

//        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
