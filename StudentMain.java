package studentmanagement;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n🎓 Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Find Student by ID");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Student Course: ");
                    String course = scanner.nextLine();

                    Student student = new Student(id, name, course);
                    manager.addStudent(student);
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();
                    Student found = manager.findStudentById(searchId);
                    if (found != null) {
                        System.out.println("🎯 Student Found: " + found);
                    } else {
                        System.out.println("❌ Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("👋 Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("❗ Invalid option. Try again.");
            }
        }
    }
}

