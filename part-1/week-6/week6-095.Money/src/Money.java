
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money amount) {
        int c = this.cents() + amount.cents();
        int e = 0;
        if (c > 99) {
            e += c / 100;
            c %= 100;
        }

        e += this.euros() + amount.euros();
        return new Money(e, c);
    }

    public boolean less(Money compared) {
        double thisMoney = this.euros() + (double) this.cents() / 100;
        double comparedMoney = compared.euros() + (double) compared.cents() / 100;

        return thisMoney < comparedMoney;
    }

    public Money minus(Money amount) {
        int c = this.cents() - amount.cents();
        int e = this.euros() - amount.euros();

        if (e < 0) {
            return new Money(0, 0);
        }

        if (c < 0) {
            e -= 1;
            c += 100;
        }

        return new Money(e, c);
    }
}
