
public class BoundedCounter {
    private int value;
    private final int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (value == upperLimit) {
            value = 0;
        } else {
            value++;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 0) {
            this.value = 0;
        } else if (value > upperLimit) {
            this.value = 0;
        } else {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d", value);
    }
}
