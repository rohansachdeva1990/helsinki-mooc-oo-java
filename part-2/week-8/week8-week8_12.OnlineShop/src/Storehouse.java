import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> products = new HashMap<String, Integer>();
    private Map<String, Integer> stocks = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        if (products.containsKey(product)) {
            return products.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (!stocks.containsKey(product)) {
            return 0;
        }
        return stocks.get(product);
    }

    public boolean take(String product) {
        if (!stocks.containsKey(product)) {
            return false;
        }
        int stock = stocks.get(product);
        if (stock == 0) {
            return false;
        }
        stocks.put(product, stock - 1);
        return true;
    }

    public Set<String> products() {
        return new HashSet<String>(products.keySet());
    }
}
