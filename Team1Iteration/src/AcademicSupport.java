import java.util.HashMap;

public interface AcademicSupport {
	void AcademicS();
	void takeSurvey();
	int getNumClasses();
	public static final HashMap<String, Integer> numAssignmentsDue = new HashMap<String, Integer>();
    boolean hasWeekendAssignments();
    void sendAssignmentReminder();
    void trackClassesTaken();

}
