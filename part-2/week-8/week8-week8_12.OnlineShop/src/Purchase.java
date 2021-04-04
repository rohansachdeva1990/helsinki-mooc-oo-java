public class Purchase {

    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return amount * unitPrice;
    }

    public void increaseAmount() {
        this.amount += 1;
    }

    @Override
    public String toString() {
        return String.format("%s: %d", product, amount);
    }
}
