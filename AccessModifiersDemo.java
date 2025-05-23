class AccessTest {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40;

    public void showValues() {
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        AccessTest obj = new AccessTest();
        obj.showValues();
        System.out.println("Accessing directly: " + obj.publicVar); // OK
        // System.out.println(obj.privateVar); // Not allowed
    }
}
