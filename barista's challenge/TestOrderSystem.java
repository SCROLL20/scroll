public class TestOrderSystem {
    public static void main(String[] args) {
        
        // Create 2 orders for unspecified guests
        Order order1 = new Order();
        Order order2 = new Order();
        
        // Create 3 orders using the overloaded constructor
        Order order3 = new Order("Cindhuri");
        Order order4 = new Order("Ramiro");
        Order order5 = new Order("Matt");
        
        // Create items
        Item item1 = new Item("drip coffee", 1.50);
        Item item2 = new Item("capuccino", 3.50);
        Item item3 = new Item("latte", 4.00);
        Item item4 = new Item("mocha", 3.75);
        
        // Add items to orders
        order1.addItem(item1);
        order1.addItem(item2);
        
        order2.addItem(item3);
        order2.addItem(item4);
        
        order3.addItem(item1);
        order3.addItem(item3);
        
        order4.addItem(item2);
        order4.addItem(item4);
        
        order5.addItem(item1);
        order5.addItem(item2);
        
        // Set some orders as ready
        order3.setReady(true);
        order4.setReady(false);
        
        // Test getStatusMessage method
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        
        // Test getOrderTotal method
        System.out.println("Order 1 Total: $" + order1.getOrderTotal());
        System.out.println("Order 2 Total: $" + order2.getOrderTotal());
        
        // Call the display method on all orders
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}

