
public class Smileys {

    private static final String SMILEY = ":)";


    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }


    /**
     * :):):):):)
     * :) abcd :)     even : size is 4, then we need 3
     * :):):):):)
     * <p>
     * :):):):):):)
     * :) abcdef :)   even: size is 6, then we need 4
     * :):):):):):)
     * <p>
     * :):):):):):):)
     * :) abcdefgh :)   even: size is 8, then we need 5
     * :):):):):):):)
     * <p>
     * (n/2) + 1
     * <p>
     * :):):):):):)
     * :) abcde  :)    odd: size is 5, then we need 4
     * :):):):):):)
     * <p>
     * :):):):):):):)
     * :) abcdefg  :)    odd: size is 7, then we need 5
     * :):):):):):):)
     * <p>
     * :):):):):):):):)
     * :) abcdefghi  :)    odd: size is 9,  then we need 6
     * :):):):):):):):)
     * <p>
     * (n/2) + 2
     */
    private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        printSmileys(length);
        printSmileysWithCharacterString(characterString);
        printSmileys(length);
    }


    private static void printSmileys(int length) {
        System.out.print(SMILEY);
        if (isOdd(length)) {
            for (int i = 0; i < (length / 2) + 2; i++) {
                System.out.print(SMILEY);
            }
        } else {
            for (int i = 0; i < (length / 2) + 1; i++) {
                System.out.print(SMILEY);
            }
        }
        System.out.println(SMILEY);
    }

    private static void printSmileysWithCharacterString(String characterString) {
        if (isOdd(characterString.length())) {
            System.out.println(String.format("%s %s  %s", SMILEY, characterString, SMILEY));
        } else {
            System.out.println(String.format("%s %s %s", SMILEY, characterString, SMILEY));
        }
    }

    private static boolean isOdd(int num) {
        return num % 2 == 1;
    }


}
