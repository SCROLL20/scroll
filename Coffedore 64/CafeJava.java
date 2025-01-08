public class CafeJava {
    public static void main(String[] args) {
        CoffeeKiosk kiosk = new CoffeeKiosk();

        // Predefined menu items
        kiosk.addMenuItem("banana", 2.00);
        kiosk.addMenuItem("coffee", 1.50);
        kiosk.addMenuItem("latte", 4.50);
        kiosk.addMenuItem("cappuccino", 3.00);
        kiosk.addMenuItem("muffin", 4.00);

        // Interactive functionality
        kiosk.newOrder();
        kiosk.addMenuItemByInput();
        kiosk.displayMenu();
    }
}
