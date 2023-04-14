
import java.util.HashMap;

public class Health {

	private HashMap<String, Integer> medications; // medication name -> number to take per day
	
	public void Meds() {
	    medications = new HashMap<>();
	        
	}
	
	public void addMedication(String name, int numPerDay) {
	    medications.put(name, numPerDay);
	}
	
	public void promptMedicationSurvey() {
	    // Prompt user with survey/questionnaire
	    // Save information in medications HashMap
	  
	    
	    System.out.println("Do you have any medications to take?");
	    String answer = System.console().readLine().toLowerCase();
	    
	    if (answer.equals("yes")) {
	        System.out.println("How many for the week of 1/31?");
	        int numTotal = Integer.parseInt(System.console().readLine());
	        
	        System.out.println("How many to take on Monday?");
	        int numMonday = Integer.parseInt(System.console().readLine());
	        
	        System.out.println("How many to take on Tuesday?");
	        int numTuesday = Integer.parseInt(System.console().readLine());
	        
	        System.out.println("How many to take on Wednesday?");
	        int numWednesday = Integer.parseInt(System.console().readLine());
	        
	        System.out.println("How many to take on Thursday?");
	        int numThursday = Integer.parseInt(System.console().readLine());
	        
	        System.out.println("How many to take on Friday?");
	        int numFriday = Integer.parseInt(System.console().readLine());
	        
	        System.out.println("Do you have to take them on the weekend as well?");
	        String weekendAnswer = System.console().readLine().toLowerCase();
	        int numWeekend = 0;
	        
	        if (weekendAnswer.equals("yes")) {
	            System.out.println("How many to take on Saturday?");
	            int numSaturday = Integer.parseInt(System.console().readLine());
	            
	            System.out.println("How many to take on Sunday?");
	            int numSunday = Integer.parseInt(System.console().readLine());
	            
	            numWeekend = numSaturday + numSunday;
	        }
	        
	        int[] numPerDay = {numMonday, numTuesday, numWednesday, numThursday, numFriday, numWeekend, numWeekend};
	        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	        
	        for (int i = 0; i < daysOfWeek.length; i++) {
	            medications.put(daysOfWeek[i], numPerDay[i]);
	        }
	        
	        int totalNumPerDay = numMonday + numTuesday + numWednesday + numThursday + numFriday + numWeekend + numWeekend;
	        System.out.println("You need to take a total of " + totalNumPerDay + " medications per day.");
	    }
	}
	
    

    public void remindMedication(String medicationName) {
        // send notification or reminder to take the medication
        System.out.println("Reminder: Take " + medicationName);
    }


 }


