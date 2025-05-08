import java.util.Scanner;

public class ExpenseTrackerupdated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your budget: ₹");
        double budget = input.nextDouble();
        input.nextLine(); // consume leftover newline

        // First expense
        System.out.print("Enter first expense name: ");
        String expense1 = input.nextLine();
        System.out.print("Enter amount for " + expense1 + ": ₹");
        double amount1 = input.nextDouble();
        input.nextLine();

        // Second expense
        System.out.print("Enter second expense name: ");
        String expense2 = input.nextLine();
        System.out.print("Enter amount for " + expense2 + ": ₹");
        double amount2 = input.nextDouble();
        input.nextLine();

        // Third expense
        System.out.print("Enter third expense name: ");
        String expense3 = input.nextLine();
        System.out.print("Enter amount for " + expense3 + ": ₹");
        double amount3 = input.nextDouble();

        // Calculate total
        double total = amount1 + amount2 + amount3;

        // Output expenses
        System.out.println("\n------ Expense Summary ------");
        System.out.printf("%s: ₹%.2f\n", expense1, amount1);
        System.out.printf("%s: ₹%.2f\n", expense2, amount2);
        System.out.printf("%s: ₹%.2f\n", expense3, amount3);
        System.out.printf("Total: ₹%.2f\n", total);

        // Check against budget
        if (total > budget) {
            System.out.println("⚠️ Warning: You are over budget!");
        } else {
            System.out.println("✅ You are within your budget.");
        }

        // Ternary operator feedback
        String status = total > budget ? "Overspending alert!" : "Spending is under control.";
        System.out.println("Status: " + status);
    }
}
