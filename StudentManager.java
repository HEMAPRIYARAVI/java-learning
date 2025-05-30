package studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    // Add a student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("✅ Student added: " + student.getName());
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠️ No students found.");
        } else {
            System.out.println("📋 Student List:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    // Optional: Find student by ID
    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}
