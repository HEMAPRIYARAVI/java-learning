class Parent {
    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child show()");
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {
        Parent p;           // Reference of parent
        p = new Child();    // Object of child
        p.show();           // Calls Child’s overridden method (dynamic dispatch)
    }
}
