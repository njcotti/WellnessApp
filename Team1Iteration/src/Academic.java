import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Academic {

	    private int numClasses;
	    private int[] numAssignmentsDue;
	    private boolean hasWeekendAssignments;
	    
	    public void Classes() {
	        // Constructor initializes the arrays to hold data for each day of the week
	        numAssignmentsDue = new int[5];
	    }
	    
	    public void takeSurvey() {
	        Scanner sc = new Scanner(System.in);
	        
	        // Prompt for number of classes
	        System.out.print("How many classes are you taking this semester? ");
	        numClasses = sc.nextInt();
	        
	        // Prompt for number of assignments due each day
	        System.out.println("Please enter the number of assignments due on each day of the week:");
	        System.out.print("Monday: ");
	        numAssignmentsDue[0] = sc.nextInt();
	        System.out.print("Tuesday: ");
	        numAssignmentsDue[1] = sc.nextInt();
	        System.out.print("Wednesday: ");
	        numAssignmentsDue[2] = sc.nextInt();
	        System.out.print("Thursday: ");
	        numAssignmentsDue[3] = sc.nextInt();
	        System.out.print("Friday: ");
	        numAssignmentsDue[4] = sc.nextInt();
	        
	        // Prompt for weekend assignments
	        System.out.print("Do you have any assignments due on the weekend? (yes or no) ");
	        String response = sc.next().toLowerCase();
	        hasWeekendAssignments = response.equals("yes");
	        
	        // Close scanner
	        sc.close();
	    }
	    
	    // Getters and setters for private fields
	    public int getNumClasses() {
	        return numClasses;
	    }
	    
	    public int[] getNumAssignmentsDue() {
	        return numAssignmentsDue;
	    }
	    
	    public boolean hasWeekendAssignments() {
	        return hasWeekendAssignments;
	    }

	    private List<Assignment> assignments;
	   
	    
	    public Academic() {
	        assignments = new ArrayList<>();
	       
	    }
	    
	    public void addAssignment(Assignment assignment) {
	        assignments.add(assignment);
	    }
	   
	    
	    public void sendAssignmentReminder() {
	        LocalDate today = LocalDate.now();
	        int count = 0;
	        for (Assignment assignment : assignments) {
	            if (assignment.getDueDate().equals(today)) {
	                System.out.println("Reminder: Assignment " + assignment.getName() + " is due today.");
	                count++;
	            }
	        }
	        System.out.println("You have " + count + " assignments due today.");
	    }
	    
	    public void trackClassesTaken() {
	        System.out.println("You are currently taking " + numClasses + " classes.");
	    }
	    
	    public void trackAssignmentsDue(LocalDate date) {
	        int count = 0;
	        for (Assignment assignment : assignments) {
	            if (assignment.getDueDate().equals(date)) {
	                count++;
	            }
	        }
	        System.out.println("You have " + count + " assignments due on " + date);
	    }
	

}
