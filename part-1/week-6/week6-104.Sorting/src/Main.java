import java.util.Arrays;

public class Main {

    public static int smallest(int[] array) {
        return array[indexOfTheSmallest(array)];
    }

    public static int indexOfTheSmallest(int[] array) {
        return indexOfTheSmallestStartingFrom(array, 0);
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        int smallestIndex = index;

        for (int i = index + 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array, j, i);
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

}
