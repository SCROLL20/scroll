public class DeviceTest {

    public static void main(String[] args) {
        Phone phone = new Phone();

        // Make 3 phone calls
        for (int i = 0; i < 3; i++) {
            phone.makeCall();
        }

        // Play a game twice
        for (int i = 0; i < 2; i++) {
            phone.playGame();
        }

        // Charge the phone once
        phone.charge();
    }
}

