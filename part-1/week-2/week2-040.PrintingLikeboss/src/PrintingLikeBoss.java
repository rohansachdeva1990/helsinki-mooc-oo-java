public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 1;
        int times = size;
        while (times > 0) {
            printWhitespaces(size - i);
            printStars(i);
            times--;
            i++;
        }
    }


    public static void xmasTree(int height) {
        // 40.3
        // print triangle
        int i = 1;
        int j = i - 1;
        int times = height;
        while (times > 0) {
            printWhitespaces(height - i);
            printStars(i + j);
            times--;
            i++;
            j = i - 1;
        }

        // print stand
        int whiteSpaces = height - 2;
        int standHeight = 2;
        int standWidth = 3;
        while (standHeight > 0) {
            printWhitespaces(whiteSpaces);
            printStars(standWidth);
            standHeight--;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
