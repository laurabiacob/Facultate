package personal.ex.OnlineStore;

import java.util.HashMap;
import java.util.Map;

public class ActiveSession {
    private String username;
    private Map<Product, Integer> shoppingCart;

    public ActiveSession(String username) {
        this.username = username;
        this.shoppingCart = new HashMap<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<Product, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void addToCart(Product product, int quantity) {
        shoppingCart.put(product, shoppingCart.getOrDefault(product, 0) + quantity);
    }

}
