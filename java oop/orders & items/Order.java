import java.util.ArrayList;

public class Order {
    String name;
    double total;
    boolean ready;
    ArrayList<Item> items;

    // Constructor that accepts a name (string)
    public Order(String name) {
        this.name = name;
        this.total = 0.0;
        this.ready = false;
        this.items = new ArrayList<>();
    }

    // Method to add an item to the order and update the total
    public void addItem(Item item) {
        items.add(item);
        total += item.getPrice();
    }

    // Method to update the status of the order
    public void updateStatus(boolean status) {
        this.ready = status;
    }

    // Method to display the order details
    public void displayOrderDetails() {
        System.out.println("Order for " + name);
        System.out.println("Items:");
        for (Item item : items) {
            System.out.println("- " + item.getName() + ": $" + item.getPrice());
        }
        System.out.println("Total: $" + total);
        System.out.println("Status: " + (ready ? "Ready" : "In progress"));
    }

    public double getTotal() {
        return total;
    }
}
