package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {
    private final int numLines;
    private final int numCharacters;

    public Analysis(File file) throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");

        int lines = 0;
        int characters = 0;

        while (reader.hasNextLine()) {
            lines++;
            characters += reader.nextLine().length() + 1;
        }
        reader.close();

        this.numLines = lines;
        this.numCharacters = characters;
    }

    public int lines() {
        return numLines;
    }

    public int characters() {
        return numCharacters;
    }
}
