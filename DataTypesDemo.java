public class DataTypesDemo {
    public static void main(String[] args) {
        // Declaring different types of variables
        int age = 28;
        double height = 5.1;
        char grade = 'A';
        boolean isLearning = true;
        String name = "Hemapriya";

        // Type casting
        double newAge = age; // Implicit casting (int to double)
        int roundedHeight = (int) height; // Explicit casting (double to int)

        // Printing variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Learning Java? " + isLearning);
        System.out.println("New Age (double): " + newAge);
        System.out.println("Rounded Height (int): " + roundedHeight);
    }
}
