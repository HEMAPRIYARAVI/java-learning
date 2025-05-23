class FinalDemo {
    final int CONSTANT = 100;

    final void display() {
        System.out.println("This is a final method.");
    }

    void showConstant() {
        // CONSTANT = 200; // ❌ Not allowed, because it's final
        System.out.println("Constant value: " + CONSTANT);
    }
}

// class ExtendedFinal extends FinalDemo {
//     void display() { } // ❌ Error: can't override final method
// }

public class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.display();
        obj.showConstant();
    }
}
