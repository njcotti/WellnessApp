
import java.util.Date;

public class Assignment {
    private String name;
    private String description;
    private Date dueDate;
    private boolean isSubmitted;

    public Assignment(String name, String description, Date dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.isSubmitted = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void submit() {
        this.isSubmitted = true;
    }
}

