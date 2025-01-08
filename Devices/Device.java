public class Device {
    protected int battery;

    public Device() {
        this.battery = 100; // Start with a battery level of 100
    }

    public void displayBattery() {
        System.out.println("Battery remaining: " + this.battery);
    }
}
