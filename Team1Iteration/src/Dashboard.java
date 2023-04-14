//import java.util.Scanner;

public class Dashboard {
    private User user;
    
    
    public Dashboard(User user) {
        this.user = user;
      
    }
    
    public void display() {
        System.out.println("Welcome to your dashboard, " + user.getName() + "!");
       
    }
}

