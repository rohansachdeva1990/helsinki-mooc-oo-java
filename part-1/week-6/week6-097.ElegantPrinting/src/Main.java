
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        String printStr = "";

        int size = array.length;
        for(int i = 0; i < size -1; i++){
            printStr = printStr.concat(String.valueOf(array[i])).concat(", ");
        }
        printStr = printStr.concat(String.valueOf(array[size -1]));
        System.out.println(printStr);
    }
}
