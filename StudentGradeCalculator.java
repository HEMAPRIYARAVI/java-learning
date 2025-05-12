import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get student name
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        // Get marks for 3 subjects
        System.out.print("Enter marks for Subject 1: ");
        int mark1 = input.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int mark2 = input.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int mark3 = input.nextInt();

        // Calculate total and average
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        // Print result
        System.out.println("\n--- Report Card ---");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
    }
}
