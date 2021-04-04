import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        printInstructions();
        while (true) {
            System.out.print("Statement:");
            String command = reader.nextLine();
            if ("quit".equals(command)) {
                System.out.println("Cheers!");
                break;
            }

            if ("add".equals(command)) {
                handleAdd();
            } else if ("translate".equals(command)) {
                handleTranslate();
            } else {
                System.out.println("Unknown statement");
            }

        }

    }

    private void handleAdd() {
        System.out.print("In Finnish: ");
        String word = reader.nextLine();
        System.out.println("Translation: ");
        String translation = reader.nextLine();
        dictionary.add(word, translation);
    }

    private void handleTranslate() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        System.out.println("Translation: " + dictionary.translate(word));
    }

    public void printInstructions() {
        System.out.println("Statements:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");
    }
}
