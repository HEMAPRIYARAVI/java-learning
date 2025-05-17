import java.util.Scanner;

public class SmartFoodOrderingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] foodItems = {"Pizza", "Burger", "Pasta", "Sandwich", "Fries"};
        double[] prices = {199.0, 149.0, 179.0, 129.0, 99.0};
        int[] quantities = new int[5];

        System.out.println("🍽️ Welcome to SmartFood Ordering System!\n");

        System.out.println("📋 Today's Menu:");
        for (int i = 0; i < foodItems.length; i++) {
            System.out.println((i + 1) + ". " + foodItems[i] + " - Rs. " + prices[i]);
        }

        System.out.print("\nHow many different items do you want to order? ");
        int numItems = input.nextInt();

        for (int i = 0; i < numItems; i++) {
            System.out.print("\nEnter item number (1 to 5): ");
            int itemNumber = input.nextInt();

            if (itemNumber < 1 || itemNumber > 5) {
                System.out.println("❌ Invalid item number. Please try again.");
                i--; // Repeat this iteration
                continue;
            }

            System.out.print("Enter quantity for " + foodItems[itemNumber - 1] + ": ");
            int qty = input.nextInt();

            quantities[itemNumber - 1] += qty;
        }

        // Calculate and display bill
        System.out.println("\n🧾 Your Bill:");
        double subtotal = 0;

        for (int i = 0; i < foodItems.length; i++) {
            if (quantities[i] > 0) {
                double itemTotal = prices[i] * quantities[i];
                System.out.println(foodItems[i] + " x " + quantities[i] + " = Rs. " + itemTotal);
                subtotal += itemTotal;
            }
        }

        double tax = subtotal * 0.05;
        double total = subtotal + tax;

        System.out.printf("Tax (5%%): Rs. %.2f%n", tax);
        System.out.printf("Total Amount: Rs. %.2f%n", total);

        System.out.println("\n🙏 Thank you for ordering with SmartFood!");
        input.close();
    }
}
