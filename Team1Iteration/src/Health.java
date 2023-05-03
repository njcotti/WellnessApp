
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Health {
	private boolean firstLogin = false;
	private boolean newWeek = false;
	private HashMap<String, Integer> medications; // medication name -> number to take per day
	
	public Health() {
	    this.medications = new HashMap<String, Integer>();
	        
	}
	
	public void addMedication(String name, int numPerDay) {
	    medications.put(name, numPerDay);
	}
	
	public void medicationSurvey() {
	    // Prompt user with survey/questionnaire
	    // Save information in medications HashMap
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
	    
	    System.out.println("Do you have any medications to take?");
	    String response = scnr.nextLine().toLowerCase();
	    
	    if( firstLogin == true && response.equals("yes")) {
           
            System.out.println("Please enter the number of medications you take on each day of the week:");
            System.out.println("Monday: ");
            medications.put("Monday", scnr.nextInt());
            System.out.println("Tuesday: ");
            medications.put("Tuesday", scnr.nextInt());
            System.out.println("Wednesday: ");
            medications.put("Wednesday", scnr.nextInt());
            System.out.println("Thursday: ");
            medications.put("Thursday", scnr.nextInt());
            System.out.println("Friday: ");
            medications.put("Friday", scnr.nextInt());
            System.out.println("Saturday: ");
            medications.put("Saturday", scnr.nextInt());
            System.out.println("Sunday: ");
            medications.put("Sunday", scnr.nextInt());
         // Set firstLogin to false to avoid repeating this block in future calls
            System.out.println("Setting Reminders..");
            remindMedication();
            firstLogin = false;
            System.out.println("Reminders set, Exiting...");
            System.exit(0);
	    }  else if (newWeek == true) {

        // Prompt for number of assignments due each day
	    	System.out.println("Please enter the number of medications you take on each day of this week:");
	    	System.out.println("Monday: ");
            medications.put("Monday", scnr.nextInt());
            System.out.println("Tuesday: ");
            medications.put("Tuesday", scnr.nextInt());
            System.out.println("Wednesday: ");
            medications.put("Wednesday", scnr.nextInt());
            System.out.println("Thursday: ");
            medications.put("Thursday", scnr.nextInt());
            System.out.println("Friday: ");
            medications.put("Friday", scnr.nextInt());
            System.out.println("Saturday: ");
            medications.put("Saturday", scnr.nextInt());
            System.out.println("Sunday: ");
            medications.put("Sunday", scnr.nextInt());
            System.out.println("Setting Reminders..");
            remindMedication();
            newWeek = false;
            System.out.println("Reminders set, Exiting...");
            System.exit(0);

        // Set newWeek to false to avoid repeating this block in future calls
        
    }

        // Close scanner
        scnr.close();
    
	}
	
	 public HashMap<String, Integer> medications() {
	        return medications;
	    }

    public void remindMedication() {
        // send notification or reminder to take their medication
    	LocalDate today = LocalDate.now();
        int count = 0;

        // Get the number of assignments due today from the HashMap
        int takeMeds = medications().get(today.getDayOfWeek());

        if (takeMeds > 0) {
            System.out.println("You have " + takeMeds + " assignments due today.");
        } else {
            System.out.println("You don't have any assignments due today.");
        }
    }


 }


