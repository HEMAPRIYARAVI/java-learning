class Calculator {

    // Method to add integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add doubles
    public double add(double a, double b) {
        return a + b;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator(); // Object stored in Heap

        int sumInt = calc.add(1, 2); // Local variable in Stack
        double sumDouble = calc.add(1.5, 2.5); // Local variable in Stack

        System.out.println("Sum of integers: " + sumInt);
        System.out.println("Sum of doubles: " + sumDouble);

        System.out.println("\n🔍 'calc' object is stored in Heap memory.");
        System.out.println("📝 'sumInt' and 'sumDouble' are stored in Stack memory.");
    }
}
