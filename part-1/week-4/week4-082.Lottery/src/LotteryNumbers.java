import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        while (numbers.size() < 7) {
            int newNumber = getNextNumber();
            if (!numbers.contains(newNumber)) {
                numbers.add(newNumber);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return numbers.contains(number);
    }

    private int getNextNumber() {
        return random.nextInt(39) + 1;
    }
}
