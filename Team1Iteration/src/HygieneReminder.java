import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class HygieneReminder implements Hygiene {
	private boolean brushTeethReminderEnabled;
    private boolean brushHairReminderEnabled;

    public void startReminders() {
        Timer timer = new Timer();
        if (brushTeethReminderEnabled) {
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    System.out.println("Reminder: Brush your teeth!");
                }
            }, getNextBrushTeethReminderTime(), 24 * 60 * 60 * 1000);
        }
        if (brushHairReminderEnabled) {
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    System.out.println("Reminder: Brush your hair!");
                }
            }, getNextBrushHairReminderTime(), 24 * 60 * 60 * 1000);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    

    public Date getNextBrushTeethReminderTime() {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        
        // Set the next reminder time for brushing teeth to be 12 hours from now
        calendar.add(Calendar.HOUR, 12);
        
        return calendar.getTime();
    }

    public Date getNextBrushHairReminderTime() {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        
        // Set the next reminder time for brushing hair to be 24 hours from now
        calendar.add(Calendar.HOUR, 24);
        
        return calendar.getTime();
    }	
}
