public class TestOrders {
    public static void main(String[] args) {
        // Create 4 Item objects
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 4.0);
        new Item("drip coffee", 2.0);
        Item item4 = new Item("cappuccino", 4.5);

        // Create 4 Order objects (with customer names)
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        // Print initial order details for order1
        order1.displayOrderDetails();

        // Predict what will happen if you print 'order1.total'
        // It will print: Total: $0.0 (since no items have been added yet)
        System.out.println("Order 1 Total: $" + order1.getTotal());

        // Add item1 to order2's item list and increment the total
        order2.addItem(item1);
        System.out.println("\nOrder 2 after adding item1 (mocha):");
        order2.displayOrderDetails();

        // Noah ordered a cappuccino. Add the cappuccino to their order list and tab
        order3.addItem(item4);
        System.out.println("\nOrder 3 after adding cappuccino:");
        order3.displayOrderDetails();

        // Sam added a latte. Update the order accordingly
        order4.addItem(item2);
        System.out.println("\nOrder 4 after adding latte:");
        order4.displayOrderDetails();

        // Cindhuri’s order is now ready. Update her status
        order1.updateStatus(true);
        System.out.println("\nOrder 1 after status update:");
        order1.displayOrderDetails();

        // Sam ordered more drinks - 2 lattes. Update their order
        order4.addItem(item2);  // First latte
        order4.addItem(item2);  // Second latte
        System.out.println("\nOrder 4 after adding 2 more lattes:");
        order4.displayOrderDetails();

        // Jimmy’s order is now ready. Update his status
        order2.updateStatus(true);
        System.out.println("\nOrder 2 after status update:");
        order2.displayOrderDetails();
    }
}
