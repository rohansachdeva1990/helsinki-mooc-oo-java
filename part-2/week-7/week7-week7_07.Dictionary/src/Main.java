import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Scanner reader = new Scanner(System.in);


        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
    }
}
