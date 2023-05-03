import java.util.Date;

public interface Hygiene {
	
	void startReminders();
	Date getNextBrushTeethReminderTime();
	Date getNextBrushHairReminderTime();
}
