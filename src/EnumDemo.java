enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum DeviceStatus {
    ON("Device is active"),
    OFF("Device is inactive"),
    STANDBY("Device is on standby");

    private final String message;

    DeviceStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

public class EnumDemo {
    public static void main(String[] args) {

        // 1. Basic Enum Usage
        Day today = Day.FRIDAY;
        System.out.println("Today is: " + today);

        // 2. Enum in Switch Statement
        switch (today) {
            case MONDAY:
                System.out.println("Start of work week.");
                break;
            case FRIDAY:
                System.out.println("Weekend is coming!");
                break;
            case SUNDAY:
                System.out.println("Time to rest.");
                break;
            default:
                System.out.println("Regular weekday.");
        }

        // 3. Enum with Properties & Methods
        DeviceStatus currentStatus = DeviceStatus.ON;
        System.out.println("Device Status: " + currentStatus);
        System.out.println("Message: " + currentStatus.getMessage());

        // 4. Loop through Enum values
        System.out.println("\nAll Days:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }

        System.out.println("\nAll Device Statuses with messages:");
        for (DeviceStatus status : DeviceStatus.values()) {
            System.out.println(status + " → " + status.getMessage());
        }
    }
}
