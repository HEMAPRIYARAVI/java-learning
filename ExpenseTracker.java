import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first expense name: ");
        String expenseName1 = input.nextLine();

        System.out.print("Enter amount for " + expenseName1 + ": ");
        double amount1 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter second expense name: ");
        String expenseName2 = input.nextLine();

        System.out.print("Enter amount for " + expenseName2 + ": ");
        double amount2 = input.nextDouble();

        System.out.println("\nYou spent ₹" + amount1 + " on " + expenseName1);
        System.out.println("You spent ₹" + amount2 + " on " + expenseName2);
    }
}
