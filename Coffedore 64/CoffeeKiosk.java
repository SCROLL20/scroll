import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // Constructor
    public CoffeeKiosk() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    // Add item to menu
    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        newItem.setIndex(menu.size());
        menu.add(newItem);
    }

    // Display the menu
    public void displayMenu() {
        for (Item item : menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
        }
    }

    // Create a new order
    public void newOrder() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter customer name for new order:");
            String name = scanner.nextLine();
            Order newOrder = new Order(name);

            displayMenu();
            System.out.println("Please enter a menu item index or 'q' to quit:");
            String input = scanner.nextLine();

            while (!input.equals("q")) {
                try {
                    int index = Integer.parseInt(input);
                    if (index >= 0 && index < menu.size()) {
                        newOrder.addItem(menu.get(index));
                    } else {
                        System.out.println("Invalid index. Try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Enter a number or 'q' to quit.");
                }
                System.out.println("Please enter a menu item index or 'q' to quit:");
                input = scanner.nextLine();
            }

            newOrder.displayOrder();
            orders.add(newOrder);
        }
    }

    // Admin function to add menu items interactively (Bonus)
    public void addMenuItemByInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter item name:");
            String name = scanner.nextLine();

            System.out.println("Enter item price:");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline

            addMenuItem(name, price);
        }
    }
}
