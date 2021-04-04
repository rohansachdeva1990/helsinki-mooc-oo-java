import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }


    public static int[] copy(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    public static int[] reverseCopy(int[] array) {
        int[] reverseCopiedArray = new int[array.length];
        for(int i =  array.length - 1, j = 0; i >= 0; i--, j++){
            reverseCopiedArray[j] = array[i];
        }
        return reverseCopiedArray;
    }

}
