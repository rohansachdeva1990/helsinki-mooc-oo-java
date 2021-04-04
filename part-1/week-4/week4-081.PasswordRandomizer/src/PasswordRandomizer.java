import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private static final String PASSWORD_STR = "abcdefghijklmnopqrstuvwxyz";
    private int length;
    private Random random = new Random();



    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        char[] passwordChars = new char[length];
        for(int i = 0; i < length; i++){
            passwordChars[i] = PASSWORD_STR.charAt(random.nextInt(PASSWORD_STR.length()));
        }
        // write code that returns a randomized password
        return String.valueOf(passwordChars);
    }
}
