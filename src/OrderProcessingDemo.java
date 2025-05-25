import java.util.function.Predicate;

// Custom Exception
class InvalidOrderException extends Exception {
    public InvalidOrderException(String message) {
        super(message);
    }
}

// Functional Interface
interface OrderProcessor {
    void process(String item, int quantity) throws InvalidOrderException;
}

public class OrderProcessingDemo {
    public static void main(String[] args) {
        // Lambda expression to implement process logic
        OrderProcessor processor = (item, quantity) -> {
            if (item == null || item.isEmpty()) {
                throw new InvalidOrderException("Item name cannot be empty!");
            }
            if (quantity <= 0) {
                throw new InvalidOrderException("Quantity must be greater than zero!");
            }
            System.out.println("Order confirmed: " + quantity + " x " + item);
        };

        // Try-Catch for exception handling
        try {
            processor.process("Laptop", 2); // valid
            processor.process("", 1);       // invalid item name
        } catch (InvalidOrderException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Another try-catch block for quantity check
        try {
            processor.process("Mobile", 0);  // invalid quantity
        } catch (InvalidOrderException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
