import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil appTest = new CafeUtil();

        // Test 1: Streak Goal
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 12: %d%n", appTest.getStreakGoal());

        // Test 2: Order Total
        System.out.println("\n----- Order Total Test -----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: $%.2f%n", appTest.getOrderTotal(lineItems));

        // Test 3: Display Menu
        System.out.println("\n----- Display Menu Test -----");
        ArrayList<String> menu = new ArrayList<>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);

        // Test 3 Overload: Display Menu with Prices
        System.out.println("\n----- Display Menu with Prices Test -----");
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(1.5);
        prices.add(3.5);
        prices.add(4.5);
        prices.add(3.0);
        if (!appTest.displayMenu(menu, prices)) {
            System.out.println("Error: Menu and prices are mismatched!");
        }

        // Test 4: Add Customer
        System.out.println("\n----- Add Customer Test -----");
        ArrayList<String> customers = new ArrayList<>();
        appTest.addCustomer(customers);

        // Ninja Bonus 1: Print Price Chart
        System.out.println("\n----- Price Chart Test -----");
        appTest.printPriceChart("Columbian Coffee Grounds", 15.0, 3);

        // Ninja Bonus 3: Print Discounted Price Chart
        System.out.println("\n----- Discounted Price Chart Test -----");
        appTest.printDiscountedPriceChart("Columbian Coffee Grounds", 15.0, 3);

        // Ninja Bonus 4: Add Multiple Customers
        System.out.println("\n----- Add Multiple Customers Test -----");
        appTest.addCustomers(customers);
    }
}
