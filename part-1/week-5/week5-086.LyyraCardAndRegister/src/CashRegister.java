
public class CashRegister {

    private static final double ECONOMICAL_LUNCH_PRICE = 2.5;
    private static final double GOURMET_LUNCH_PRICE = 4.0;

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens

        if (ECONOMICAL_LUNCH_PRICE > cashGiven) {
            return cashGiven;
        }

        cashInRegister += ECONOMICAL_LUNCH_PRICE;
        economicalSold += 1;

        return cashGiven - ECONOMICAL_LUNCH_PRICE;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens

        if (GOURMET_LUNCH_PRICE > cashGiven) {
            return cashGiven;
        }
        cashInRegister += GOURMET_LUNCH_PRICE;
        gourmetSold += 1;
        return cashGiven - GOURMET_LUNCH_PRICE;
    }

    public boolean payEconomical(LyyraCard card) {
        boolean isPaid = card.pay(ECONOMICAL_LUNCH_PRICE);
        if (isPaid) {
            economicalSold++;
        }
        return isPaid;
    }

    public boolean payGourmet(LyyraCard card) {
        boolean isPaid = card.pay(GOURMET_LUNCH_PRICE);
        if (isPaid) {
            gourmetSold++;
        }
        return isPaid;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            cashInRegister += sum;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
