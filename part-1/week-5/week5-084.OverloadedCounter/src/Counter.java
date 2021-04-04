public class Counter {

    private int value;
    private boolean check;

    public Counter() {
    }

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(boolean check) {
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public int value() {
        return value;
    }

    public void increase() {
        this.value += 1;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount < 0) return;
        this.value += increaseAmount;
    }

    public void decrease() {
        if (this.value - 1 < 0 && check) {
            return;
        }
        this.value -= 1;
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) return;
        if (this.value - decreaseAmount < 0 && check) {
            this.value = 0;
            return;
        }
        this.value -= decreaseAmount;
    }

}
