import java.util.Random;

public class RandomValueGenerator {
    private Random random = new Random();
    private int maxValue;
    private int minValue;

    public RandomValueGenerator(int minValue, int maxValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    public int generate() {
        return random.nextInt(maxValue - minValue + 1) + minValue;
    }
}
