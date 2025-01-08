public class Phone extends Device {

    public Phone() {
        super(); // Call the parent class constructor
    }

    public void makeCall() {
        this.battery -= 5;
        System.out.println("You make a call.");
        displayBattery();
        checkBatteryCritical();
    }

    public void playGame() {
        if (this.battery >= 25) {
            this.battery -= 20;
            System.out.println("You play a game.");
            displayBattery();
        } else {
            System.out.println("Battery too low to play a game.");
        }
    }

    public void charge() {
        this.battery += 50;
        if (this.battery > 100) {
            this.battery = 100;
        }
        System.out.println("Charging the phone.");
        displayBattery();
    }

    public void checkBatteryCritical() {
        if (this.battery < 10) {
            System.out.println("Battery critical! Please charge soon.");
        }
    }
}
