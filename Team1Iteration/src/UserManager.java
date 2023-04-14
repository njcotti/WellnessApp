
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

public class UserManager {
    private HashMap<String, User> users;
    
    public UserManager() {
        users = new HashMap<String, User>();
    }
    
    public void addUser(User user) {
        users.put(user.getUsername(), user);
    }
    
    public User getUser(String username) {
        return users.get(username);
    }
    
    public boolean usernameExists(String username) {
        return users.containsKey(username);
    }
    
    public boolean authenticateUser(String username, String password) {
        User user = getUser(username);
        if (user != null) {
            String encryptedPassword = encryptPassword(password);
            return user.getPassword().equals(encryptedPassword);
        }
        return false;
    }
    
    public String encryptPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < hash.length; i++) {
                sb.append(Integer.toHexString((hash[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}