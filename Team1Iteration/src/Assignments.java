import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

 public class Assignments implements AcademicSupport {

     private int numClasses;
     private HashMap<String, Integer> numAssignmentsDue;
     private boolean hasWeekendAssignments;
     private boolean firstLogin = false;
     private boolean newWeek = false;
    
     public Assignments() {
        // Constructor initializes the HashMap to hold data for each day of the week
         this.numAssignmentsDue = new HashMap<String, Integer>();
    }

     public void takeSurvey() {
         Scanner scnr = new Scanner(System.in);
         if(firstLogin == false) {
             System.out.println("Is this your first time logging in?");
             String newbie = scnr.nextLine().toLowerCase();
             if (newbie.equals("yes")) {
                firstLogin = true;
             } else if(newbie.equals("no")) {
                newWeek = true;
             }
        }

        if( firstLogin == true) {
            // Prompt for number of classes
            System.out.print("How many classes are you taking this semester? ");
            numClasses = scnr.nextInt();
            scnr.nextLine();

            // Prompt for number of assignments due each day
            System.out.println("Please enter the number of assignments due on each day of the week:");
            System.out.println("Monday: ");
            numAssignmentsDue.put("Monday", scnr.nextInt());
            System.out.println("Tuesday: ");
            numAssignmentsDue.put("Tuesday", scnr.nextInt());
            System.out.println("Wednesday: ");
            numAssignmentsDue.put("Wednesday", scnr.nextInt());
            System.out.println("Thursday: ");
            numAssignmentsDue.put("Thursday", scnr.nextInt());
            System.out.println("Friday: ");
            numAssignmentsDue.put("Friday", scnr.nextInt());

            // Prompt for weekend assignments
            System.out.print("Do you have any assignments due on the weekend? (yes or no) ");
            String response = scnr.next().toLowerCase();
            if(response.equals("yes")) {
                hasWeekendAssignments = true;
                System.out.println("Please enter the number of assignments due on each day of the weekend:");
                System.out.println("Saturday: ");
                numAssignmentsDue.put("Saturday", scnr.nextInt());
                System.out.println("Sunday: ");
                numAssignmentsDue.put("Sunday", scnr.nextInt());
            } else if (response.equals("no")) {
                hasWeekendAssignments = false;
                System.out.println("Lucky you! Have fun and be safe!");
                System.out.println("Exiting..");
                System.exit(0);
            }

            // Set firstLogin to false to avoid repeating this block in future calls
            firstLogin = false;

        } else if (newWeek == true) {

            // Prompt for number of assignments due each day
            System.out.println("Please enter the number of assignments due on each day of the week:");
            System.out.println("Monday: ");
            numAssignmentsDue.put("Monday", scnr.nextInt());
            System.out.println("Tuesday: ");
            numAssignmentsDue.put("Tuesday", scnr.nextInt());
            System.out.println("Wednesday: ");
            numAssignmentsDue.put("Wednesday", scnr.nextInt());
            System.out.println("Thursday: ");
            numAssignmentsDue.put("Thursday", scnr.nextInt());
            System.out.println("Friday: ");
            numAssignmentsDue.put("Friday", scnr.nextInt());

            // Prompt for weekend assignments
            System.out.print("Do you have any assignments due on the weekend? (yes or no) ");
            String response = scnr.next().toLowerCase();
            if(response.equals("yes")) {
                hasWeekendAssignments = true;
                System.out.println("Please enter the number of assignments due on each day of the weekend:");
                System.out.println("Saturday: ");
                numAssignmentsDue.put("Saturday", scnr.nextInt());
                System.out.println("Sunday: ");
                numAssignmentsDue.put("Sunday", scnr.nextInt());
            } else if (response.equals("no")) {
                hasWeekendAssignments = false;
                
            }

            // Set newWeek to false to avoid repeating this block in future calls
            newWeek = false;
        }

            // Close scanner
        scnr.close();
        }
	        
      
	    
	    

		// Getters and setters for private fields
	    public int getNumClasses() {
	        return numClasses;
	    }
	    
	    public HashMap<String, Integer> getNumAssignmentsDue() {
	        return numAssignmentsDue;
	    }
	    
	    public boolean hasWeekendAssignments() {
	        return hasWeekendAssignments;
	    }
	    public void sendAssignmentReminder() {
	        LocalDate today = LocalDate.now();
	        int count = 0;

	        // Get the number of assignments due today from the HashMap
	        int assignmentsDueToday = getNumAssignmentsDue().get(today.getDayOfWeek());

	        if (assignmentsDueToday > 0) {
	            System.out.println("You have " + assignmentsDueToday + " assignments due today.");
	        } else {
	            System.out.println("You don't have any assignments due today.");
	        }
	    }

	    
	    public void trackClassesTaken() {
	        System.out.println("You are currently taking " + numClasses + " classes.");
	    }

		

}

