import java.util.Scanner;

public class AcademicHelp {
	
	public void helpNeeded() {
		int phoneNumber = 321-674-7110;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Do you need academic help/advice with a specific subject?");
		String response = scnr.nextLine().toLowerCase();
		if(response.equals("yes")) {
			System.out.println("Here is the website for the Academic Support Center");
			System.out.println("https://www.fit.edu/student-success-support-center/");
			System.out.println("Call this number " + phoneNumber+ " to make an appointment with a FREE tutor");
			System.out.println("Here are their hours: " );
			System.out.println("Monday - Thursday:  \n" + "8 a.m. – 7 p.m.\n" + "Friday:  \n" + "8 a.m. – 6 p.m. " );
		}
						

	}



}
