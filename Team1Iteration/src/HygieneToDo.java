import java.util.ArrayList;
import java.util.Scanner;
public class HygieneToDo {
	    private ArrayList<String> tasks;
	    
	    public HygieneToDo() {
	        tasks = new ArrayList<String>();
	    }
	    
	    public void addTask(String task) {
	        tasks.add(task);
	        System.out.println("Added task: " + task);
	    }
	    
	    public void removeTask(int index) {
	        if (index < tasks.size()) {
	            String task = tasks.remove(index);
	            System.out.println("Removed task: " + task);
	        } else {
	            System.out.println("Invalid index: " + index);
	        }
	    }
	    
	    public void printTasks() {
	        System.out.println("You tasks are:");
	        for (int i = 0; i < tasks.size(); i++) {
	            System.out.println((i + 1) + ". " + tasks.get(i));
	        }
	    }
	    
	    public static void main(String[] args) {
	        Scanner scnr = new Scanner(System.in);
	        HygieneToDo toDoList = new HygieneToDo();
	        while (true) {
	        	System.out.println("\nHYGIENE TODO LIST");
	            System.out.println("\nWhat would you like to do?");
	            System.out.println("1. Add a task");
	            System.out.println("2. Remove a task");
	            System.out.println("3. Print all tasks");
	            System.out.println("4. Exit");
	            int choice = scnr.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.println("Enter task:");
	                    scnr.nextLine();
	                    String task = scnr.nextLine();
	                    toDoList.addTask(task);
	                    break;
	                case 2:
	                    System.out.println("Enter the task number:");
	                    int index = scnr.nextInt() - 1;
	                    toDoList.removeTask(index);
	                    break;
	                case 3:
	                    toDoList.printTasks();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    scnr.close();
	                    //System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice: " + choice);
	                    break;
	            }
	        }
	    }
	

}
