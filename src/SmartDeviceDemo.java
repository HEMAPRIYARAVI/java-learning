//Abstract class(with constructor, methods, abstract method)
abstract class SmartDevice {
    protected String deviceName;
    protected boolean isOn;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(deviceName + " is turned ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(deviceName + " is turned OFF.");
    }

    public boolean isDeviceOn() {
        return isOn;
    }

    public abstract void deviceStatus();
}

//subclass with overriding(Inheritance and overriding)

class Light extends SmartDevice {
    private int brightness;

    public Light(String name, int brightness) {
        super(name);
        this.brightness = brightness;
    }

    @Override
    public void deviceStatus() {
        System.out.println(deviceName + " is " + (isOn ? "ON" : "OFF") + " with brightness " + brightness);
    }
}


class Fan extends SmartDevice {

    private int speed;

    public Fan(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public void deviceStatus() {
        System.out.println(deviceName + " is " + (isOn ? "ON" : "OFF") + " at speed level " + speed);
    }
}

//Interface(implemented by class)

interface Schedulable {
    void scheduleStart(String time);
}

class AirConditioner extends SmartDevice implements Schedulable {

    private int temperature;

    public AirConditioner(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }

    @Override
    public void deviceStatus() {
        System.out.println(deviceName + " is " + (isOn ? "ON" : "OFF") + " at temperature " + temperature);
    }

    @Override
    public void scheduleStart(String time) {
        System.out.println(deviceName + " is scheduled to start at " + time);
    }
}

//Demo class(Polymorphism + Upcasting)

public class SmartDeviceDemo {
    public static void main(String[] args) {
        SmartDevice light = new Light("Hall Light", 70);
        SmartDevice fan = new Fan("Bedroom Fan", 3);
        SmartDevice ac = new AirConditioner("Living Room AC", 24);

        light.turnOn();
        fan.turnOn();
        ac.turnOn();

        light.deviceStatus();
        fan.deviceStatus();
        ac.deviceStatus();

        // Interface usage
        ((AirConditioner) ac).scheduleStart("6:00 PM");

        // Anonymous Inner Class
        SmartDevice dummyDevice = new SmartDevice("Demo Device") {
            @Override
            public void deviceStatus() {
                System.out.println(deviceName + " is just a test device.");
            }
        };
        dummyDevice.turnOn();
        dummyDevice.deviceStatus();
    }
}
