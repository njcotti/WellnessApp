
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Health {
    private List<String> medicationList;
    private Map<String, Integer> medicationCountMap;

    public Health() {
        this.medicationList = new ArrayList<>();
        this.medicationCountMap = new HashMap<>();
    }

    public void addMedication(String medicationName) {
        medicationList.add(medicationName);
        medicationCountMap.put(medicationName, 0);
    }

    public void removeMedication(String medicationName) {
        medicationList.remove(medicationName);
        medicationCountMap.remove(medicationName);
    }

    public int getMedicationCount(String medicationName) {
        if (medicationCountMap.containsKey(medicationName)) {
            return medicationCountMap.get(medicationName);
        }
        return 0;
    }

    public void incrementMedicationCount(String medicationName) {
        if (medicationCountMap.containsKey(medicationName)) {
            int count = medicationCountMap.get(medicationName);
            medicationCountMap.put(medicationName, count + 1);
        }
    }

    public void decrementMedicationCount(String medicationName) {
        if (medicationCountMap.containsKey(medicationName)) {
            int count = medicationCountMap.get(medicationName);
            if (count > 0) {
                medicationCountMap.put(medicationName, count - 1);
            }
        }
    }

    public void remindMedication(String medicationName) {
        // send notification or reminder to take the medication
        System.out.println("Reminder: Take " + medicationName);
    }

    public void remindMedicationDay(String day) {
        for (String medication : medicationList) {
            int medicationCount = getMedicationCount(medication);
            if (medicationCount > 0) {
                // send notification or reminder to take the medication on this day
                System.out.println("Reminder: Take " + medicationCount + " " + medication + " on " + day);
            }
        }
    }
}

