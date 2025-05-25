import java.util.ArrayList;
import java.util.List;

// Enum to represent task priority
enum TaskPriority {
    LOW, MEDIUM, HIGH
}

// Functional interface
@FunctionalInterface
interface TaskAction {
    void perform(Task task);
}

// Task class
class Task {
    String name;
    TaskPriority priority;

    public Task(String name, TaskPriority priority) {
        this.name = name;
        this.priority = priority;
    }

    public void displayTask() {
        System.out.println("Task: " + name + " | Priority: " + priority);
    }
}

// Main class
public class TaskManager {
    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();

        // Add tasks
        taskList.add(new Task("Buy groceries", TaskPriority.MEDIUM));
        taskList.add(new Task("Prepare for interview", TaskPriority.HIGH));
        taskList.add(new Task("Read a book", TaskPriority.LOW));

        // Lambda to display tasks
        TaskAction display = task -> task.displayTask();

        System.out.println("📋 Your Task List:");
        for (Task task : taskList) {
            display.perform(task);
        }
    }
}
