import java.util.Scanner;

public class Operators
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Variable Declarations
        int age = 28;
        double salary = 50000.75;
        char grade = 'A';
        boolean isLearningJava = true;
        String name;

        // 2. Input from User
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your monthly rent: ");
        double rent = input.nextDouble();

        // 3. Type Casting (Narrowing)
        int rentRounded = (int) rent;

        // 4. Arithmetic Operation
        double annualRent = rent * 12;

        // 5. Relational & Logical Operators
        boolean isExpensive = rent > 10000 && salary < 60000;

        // 6. Ternary Operator
        String budgetComment = rent < 10000 ? "Rent is within budget" : "Rent is high";

        // 7. Output Everything
        System.out.println("\n--- Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Learning Java: " + isLearningJava);
        System.out.println("Monthly Rent: ₹" + rent + " (Rounded: ₹" + rentRounded + ")");
        System.out.println("Annual Rent: ₹" + annualRent);
        System.out.println("Is rent expensive? " + isExpensive);
        System.out.println("Budget Comment: " + budgetComment);
    }
}
