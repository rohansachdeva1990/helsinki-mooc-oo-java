import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<String, Purchase> purchases = new HashMap<String, Purchase>();

    public ShoppingBasket() {
    }

    public void add(String product, int price) {
        if (!purchases.containsKey(product)) {
            purchases.put(product, new Purchase(product, 1, price));
        } else {
            Purchase oldPurchase = purchases.get(product);
            oldPurchase.increaseAmount();
        }
    }

    public int price() {
        int totalPrice = 0;
        for (Purchase purchase : purchases.values()) {
            totalPrice += purchase.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Purchase purchase : purchases.values()) {
            System.out.println(purchase);
        }
    }
}
