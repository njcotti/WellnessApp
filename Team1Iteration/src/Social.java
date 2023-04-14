

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
        setClubNotification(club);
    }

    public void setClubNotification(String club) {
        // logic to set notification for social club
        // notification we can set based on the meeting schedule of the club
    	// or if user pre-adds dates they want to remember
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


