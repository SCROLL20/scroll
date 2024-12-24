import java.util.ArrayList;

public class CafeUtil {

    // Method 1: Get Streak Goal
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    // Overloaded Method for default 10 weeks
    public int getStreakGoal() {
        return getStreakGoal(10);
    }

    // Method 2: Get Order Total
    public double getOrderTotal(double[] prices) {
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    // Method 3: Display Menu
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    // Overloaded Display Menu Method (with Prices)
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d %s -- $%.2f%n", i, menuItems.get(i), prices.get(i));
        }
        return true;
    }

    // Method 4: Add Customer
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.printf("Hello, %s!%n", username);
        System.out.printf("There are %d people in front of you.%n", customers.size());
        customers.add(username);
        System.out.println("Current customers: " + customers);
    }

    // Ninja Bonus 1: Print Price Chart
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            System.out.printf("%d - $%.2f%n", i, price * i);
        }
    }

    // Ninja Bonus 3: Print Price Chart with Progressive Discounts
    public void printDiscountedPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        double discount = 0.0;
        for (int i = 1; i <= maxQuantity; i++) {
            System.out.printf("%d - $%.2f%n", i, price * i - discount);
            discount += 0.50;
        }
    }

    // Ninja Bonus 4: Add Multiple Customers
    public void addCustomers(ArrayList<String> customers) {
        System.out.println("Enter customer names. Type 'q' to quit.");
        while (true) {
            String input = System.console().readLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            customers.add(input);
            System.out.printf("Added %s. Current customers: %s%n", input, customers);
        }
    }
}
