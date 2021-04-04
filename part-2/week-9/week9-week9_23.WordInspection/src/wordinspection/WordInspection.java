package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private List<String> words = new ArrayList<String>();

    public WordInspection(File file) throws Exception {
        extractWords(file);
    }

    private void extractWords(File file) throws Exception {

        Scanner reader = null;
        try {
            reader = new Scanner(file, "UTF-8");
            while (reader.hasNextLine()) {
                words.add(reader.nextLine().trim().toLowerCase());
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }

    public int wordCount() {
        // Assuming every line has one word as per exercise criteria
        return words.size();
    }

    public List<String> wordsContainingZ() {
        List<String> wordsContainingZ = new ArrayList<String>();
        for (String word : words) {
            if (word.contains("z")) {
                wordsContainingZ.add(word);
            }
        }
        return wordsContainingZ;
    }

    public List<String> wordsEndingInL() {
        List<String> wordsEndingInL = new ArrayList<String>();
        for (String word : words) {
            if (word.lastIndexOf("l") == word.length() - 1) {
                wordsEndingInL.add(word);
            }
        }
        return wordsEndingInL;
    }

    public List<String> palindromes() {
        List<String> palindromes = new ArrayList<String>();
        for (String word : words) {
            if (isPalindrome(word)) {
                palindromes.add(word);
            }
        }
        return palindromes;
    }

    private boolean isPalindrome(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start <= end) {
            char startChar = word.charAt(start);
            char endChar = word.charAt(end);
            if (startChar != endChar) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> wordsContainingAllVowels = new ArrayList<String>();
        for (String word : words) {
            if (containsAllVowels(word)) {
                wordsContainingAllVowels.add(word);
            }
        }
        return wordsContainingAllVowels;
    }

    private boolean containsAllVowels(String word) {
        final char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y', 'ä', 'ö'};
        for (char vowel : vowels) {
            if (!word.contains("" + vowel)) {
                return false;
            }
        }
        return true;
    }

}
