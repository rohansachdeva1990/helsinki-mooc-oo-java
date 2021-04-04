public class LyyraCard {

    private final double ECONOMICAL_PAY = 2.5;
    private final double GOURMENT_PAY = 4;
    private double balance;

    public LyyraCard(double balance) {
        this.balance = balance;
    }

    public void payEconomical() {
        // write code here
        if (balance - ECONOMICAL_PAY >= 0) {
            balance -= ECONOMICAL_PAY;
        }
    }

    public void payGourmet() {
        // write code here
        if (balance - GOURMENT_PAY >= 0) {
            balance -= GOURMENT_PAY;
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            balance = (balance + amount) > 150 ? 150 : (balance + amount);
        }
    }

    @Override
    public String toString() {
        return String.format("The card has %.1f euros", balance);
    }
}
