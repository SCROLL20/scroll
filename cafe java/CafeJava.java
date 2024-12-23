public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        double dripCoffeePrice = 2.0;
        double lattePrice = 4.0;
        double cappuccinoPrice = 4.5;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)

        // Cindhuri's Order Status
        System.out.println(generalGreeting + customer1); // Welcome message
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage); // Order ready
        } else {
            System.out.println(customer1 + pendingMessage); // Order pending
        }

        // Noah's Cappuccino Order
        System.out.println(generalGreeting + customer4); // Welcome message
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice); // Total for cappuccino
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        // Sam's Latte Order (2 lattes)
        System.out.println(generalGreeting + customer2); // Welcome message
        double samTotal = 2 * lattePrice; // Total for 2 lattes
        System.out.println(displayTotalMessage + samTotal);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        // Jimmy's Order Adjustment (charged for drip coffee, ordered a latte)
        System.out.println(generalGreeting + customer3); // Welcome message
        double jimmyAdjustment = lattePrice - dripCoffeePrice; // Difference to pay
        System.out.println(displayTotalMessage + jimmyAdjustment);
    }
}
