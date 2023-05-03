import java.util.Scanner;

public class Main {
	private static Scanner scnr = new Scanner(System.in);
    private static User student;

    public static void main(String[] args) {
        // Create a new student
        student = new User("Jane Smith","123","jsmith@my.school.edu","Freshman", true,"jsmith","ilovemydog", UserType.STUDENT);

        // Display the main menu
        displayMainMenu();
    }

    private static void displayMainMenu() {
        System.out.println("Welcome to the Balance App!");
        System.out.println("Please select an option:");
        System.out.println("1. Search for support");
        System.out.println("2. View student profile");
        System.out.println("3. Exit");

        int choice = scnr.nextInt();

        switch (choice) {
            case 1:
                displaySupportMenu();
                break;
            case 2:
                displayProfile();
                break;
            case 3:
                System.out.println("Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
                displayMainMenu();
        }
    }

    private static void displaySupportMenu() {
        System.out.println("Please select a category:");
        System.out.println("1. Academic Help");
        System.out.println("2. Track Assignments");
        System.out.println("3. Hygiene Reminder");
        System.out.println("4. Create Hygiene ToDo List");
        System.out.println("5. Find Social Club");
        System.out.println("6. Health");
        System.out.println("7. Back to main menu");

        int choice = scnr.nextInt();

        switch (choice) {
            case 1:
            	AcademicHelp academicHelp = new AcademicHelp();
                academicHelp.helpNeeded();
                displayMainMenu();
            case 2:
                Assignments assignments = new Assignments();
                assignments.takeSurvey();
                assignments.sendAssignmentReminder();
                assignments.trackClassesTaken();
                displayMainMenu();
            case 3:
                HygieneReminder newRemind = new HygieneReminder();
                newRemind.startReminders();
                System.out.println("Starting Hygiene Reminders...");
                System.out.println("Taking you back to main menu.");
                displayMainMenu();
            case 4:
            	HygieneToDo hygieneToDo = new HygieneToDo();
                hygieneToDo.main(null);
                displayMainMenu();
            case 5:
                Social club = new Social();
                club.viewSocialClubs();
                club.promptSocialClubInput();
                displayMainMenu();
            case 6:
                Health meds = new Health();
                meds.medicationSurvey();
                meds.remindMedication();
                displayMainMenu();
            case 7:
                displayMainMenu();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                displaySupportMenu();
        }
    }

    private static void displayProfile() {
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getID());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Academic level: " + student.getAcademicLevel());
        System.out.println("Any required medications?: " + student.getMedication());
        System.out.println();
        displayMainMenu();
    }
}
