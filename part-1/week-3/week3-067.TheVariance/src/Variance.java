import java.util.ArrayList;

/**
 * double variance = 0.0;
 * if (count > 1L) {
 * variance = (squares-(double)sum*sum/count)/(count-1);
 * }
 * return variance;
 */
public class Variance {

    public static int sumSquares(ArrayList<Integer> list) {
        int sum = 0;
        for (int v : list) {
            sum += v * v;
        }
        return sum;
    }

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int v : list) {
            sum += v;
        }
        return sum;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return (double) sum(list) / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double variance = 0.0;
        int count = list.size();
        if (count > 1) {
            variance = (sumSquares(list) - (double) sum(list) * average(list)) / (count - 1);
        }

        return variance;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
