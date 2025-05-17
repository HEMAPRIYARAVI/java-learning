import java.util.Scanner;

class GroceryStore {

    // Method to calculate price for integers (quantity * price per unit)
    public int calculatePrice(int quantity, int pricePerUnit) {
        return quantity * pricePerUnit;
    }

    // Method Overloading for doubles (for weighted items like fruits)
    public double calculatePrice(double weight, double pricePerKg) {
        return weight * pricePerKg;
    }
}

public class GroceryBillingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GroceryStore store = new GroceryStore();
        boolean shopping = true;

        double totalBill = 0.0;

        System.out.println("🛒 Welcome to Simple Grocery Billing System!");

        while (shopping) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Add Packaged Item (By Quantity)");
            System.out.println("2. Add Fruits/Vegetables (By Weight)");
            System.out.println("3. View Total Bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter price per item: ");
                    int pricePerItem = sc.nextInt();

                    int itemTotal = store.calculatePrice(quantity, pricePerItem);
                    totalBill += itemTotal;

                    System.out.println("Item added! Subtotal: ₹" + itemTotal);
                    break;

                case 2:
                    System.out.print("Enter weight (in kg): ");
                    double weight = sc.nextDouble();
                    System.out.print("Enter price per kg: ");
                    double pricePerKg = sc.nextDouble();

                    double weightTotal = store.calculatePrice(weight, pricePerKg);
                    totalBill += weightTotal;

                    System.out.println("Item added! Subtotal: ₹" + weightTotal);
                    break;

                case 3:
                    System.out.println("🧾 Your Total Bill so far: ₹" + totalBill);
                    break;

                case 4:
                    System.out.println("Thank you for shopping with us! Final Bill: ₹" + totalBill);
                    shopping = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
