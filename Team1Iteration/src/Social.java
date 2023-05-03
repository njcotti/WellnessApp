

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Social {
    private List<String> socialClubs;

    public Social() {
        socialClubs = new ArrayList<>();
    }

    public void addSocialClub(String club) {
        socialClubs.add(club);
        
    }

    public void viewSocialClubs() {
    	Scanner scnr = new Scanner(System.in);
		System.out.println("Do you want to know what events are happening on campus this week?");
		String response = scnr.nextLine().toLowerCase();
		if(response.equals("yes")) {
			System.out.println("Here is the website for the Engage system");
			System.out.println("https://floridatech.campuslabs.com/engage/");
			System.out.println("Follow the seperate links on the page to search and attend events! " );
		}
    }

    public List<String> getSocialClubs() {
        return socialClubs;
    }

    public void promptSocialClubInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the social club you are part of: ");
        String club = scanner.nextLine();
        addSocialClub(club);
        System.out.println("Social club added: " + club);
    }
}


