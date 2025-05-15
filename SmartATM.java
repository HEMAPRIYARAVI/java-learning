import java.util.Scanner;

public class SmartATM {
    public static void main(String[] args) {
        final double MAX_WITHDRAWAL = 10000.0;
        final double MAX_DEPOSIT = 50000.0;
        final String CORRECT_PASSWORD = "1234";

        double balance = 1000.0;
        Scanner input = new Scanner(System.in);
        boolean running = true;

        // Password check
        System.out.print("Enter ATM password to continue: ");
        String enteredPassword = input.nextLine();

        if (!enteredPassword.equals(CORRECT_PASSWORD)) {
            System.out.println("❌ Incorrect password. Exiting...");
            return;
        }

        System.out.println("✅ Login successful! 🏦 Welcome to Smart ATM");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("💰 Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = input.nextDouble();
                    if (depositAmount <= 0 || depositAmount > MAX_DEPOSIT) {
                        System.out.println("❌ Invalid amount. Max deposit is ₹" + MAX_DEPOSIT);
                    } else {
                        balance += depositAmount;
                        System.out.println("✅ ₹" + depositAmount + " deposited.");
                        System.out.println("💰 Updated Balance: ₹" + balance);
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = input.nextDouble();
                    if (withdrawAmount <= 0 || withdrawAmount > MAX_WITHDRAWAL) {
                        System.out.println("❌ Invalid amount. Max withdrawal is ₹" + MAX_WITHDRAWAL);
                    } else if (withdrawAmount > balance) {
                        System.out.println("❌ Insufficient balance.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("✅ ₹" + withdrawAmount + " withdrawn.");
                        System.out.println("💰 Updated Balance: ₹" + balance);
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("👋 Thank you for using Smart ATM. Goodbye!");
                    break;

                default:
                    System.out.println("⚠️ Invalid choice. Please try again.");
            }
        }

        input.close();
    }
}
