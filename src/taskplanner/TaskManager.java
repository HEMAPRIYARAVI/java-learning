package taskplanner;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();

        // Adding some sample tasks
        tasks.add(new Task("Complete Java project", "Finish SmartHomeControlSystem", TaskStatus.IN_PROGRESS, TaskPriority.HIGH));
        tasks.add(new Task("Watch Telusko", "Learn Functional Interfaces", TaskStatus.PENDING, TaskPriority.MEDIUM));
        tasks.add(new Task("Grocery Shopping", "Buy milk, rice, fruits", TaskStatus.COMPLETED, TaskPriority.LOW));
        tasks.add(new Task("Review GitHub Readme", "Improve JavaBasics documentation", TaskStatus.PENDING, TaskPriority.MEDIUM));

        System.out.println("📋 All Tasks:");
        displayTasks(tasks, task -> true);

        System.out.println("\n✅ Completed Tasks:");
        displayTasks(tasks, task -> task.getStatus() == TaskStatus.COMPLETED);

        System.out.println("\n🔥 High Priority Tasks:");
        displayTasks(tasks, task -> task.getPriority() == TaskPriority.HIGH);

        System.out.println("\n⏳ Pending Tasks:");
        displayTasks(tasks, task -> task.getStatus() == TaskStatus.PENDING);
    }

    private static void displayTasks(List<Task> tasks, TaskFilter filter) {
        for (Task task : tasks) {
            if (filter.filter(task)) {
                System.out.println(task);
            }
        }
    }
}
