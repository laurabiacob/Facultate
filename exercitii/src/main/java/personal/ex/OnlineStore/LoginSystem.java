package personal.ex.OnlineStore;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
public class LoginSystem {
    private Set<User> users;
    private OnlineStore store;

    public LoginSystem() {
        this.users = new HashSet<>();
        this.store = new OnlineStore();
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public OnlineStore getStore() {
        return store;
    }

    public void setStore(OnlineStore store) {
        this.store = store;
    }

    public void register(String username, String password) {
        users.add(new User(username, password));
    }

    public boolean login(String username, String password) {
        return users.stream()
                .anyMatch(user -> user.getUsername().equals(username) && user.getPassword().equals(password));
    }

    public void logout(String username) {
        store.removeSession(username);
    }

}
