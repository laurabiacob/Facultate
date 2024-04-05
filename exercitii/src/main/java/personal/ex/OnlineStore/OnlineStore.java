package personal.ex.OnlineStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineStore {
    private List<Product> products;
    private Map<String, ActiveSession> sessions;

    public OnlineStore() {
        this.products = new ArrayList<>();
        this.sessions = new HashMap<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Map<String, ActiveSession> getSessions() {
        return sessions;
    }

    public void setSessions(Map<String, ActiveSession> sessions) {
        this.sessions = sessions;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addSession(String username) {
        sessions.put(username, new ActiveSession(username));
    }

    public void removeSession(String username) {
        sessions.remove(username);
    }

    public void addToCart(String username, Product product, int quantity) {
        sessions.get(username).addToCart(product, quantity);
    }
    public void addProducts() {
        products.add(new Product("apple", 1.0));
        products.add(new Product("banana", 0.5));
        products.add(new Product("orange", 0.8));
    }

    public String checkout(String username) {
        // Implement checkout logic
        return "Checkout successful!";
    }
    
}
