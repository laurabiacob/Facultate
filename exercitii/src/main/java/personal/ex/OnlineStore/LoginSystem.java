package personal.ex.OnlineStore;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
public class LoginSystem {
    private Set<User> users;
    private OnlineStore store;
    private Map<String,ActiveSession> sessions;
    public LoginSystem(OnlineStore store){
        this.users=new HashSet<>();
        this.store=store;
        this.sessions=new HashMap<>();
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
    public Map<String, ActiveSession> getSessions() {
        return sessions;
    }
    public void setSessions(Map<String, ActiveSession> sessions) {
        this.sessions = sessions;
    }

    public void register(String username, String password){
        User user = new User(username, password);
        users.add(user);
    }
    public boolean login(String username,String password){
        for (User user : users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                ActiveSession session = new ActiveSession(username);
                sessions.put(username,session);
                return true;
            }
        }
        return false;
    }
    public void logout(String username){
        sessions.remove(username);
    }
    public void addSession(String username){
        sessions.put(username,new ActiveSession(username));
    }
    public void removeSession(String username){
        sessions.remove(username);
    }

}
