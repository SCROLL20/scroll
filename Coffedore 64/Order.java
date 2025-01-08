import java.util.ArrayList;

public class Order {
    private String name;
    private ArrayList<Item> items;

  
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

  
    public void displayOrder() {
        System.out.println("Order for: " + name);
        for (Item item : items) {
            System.out.println(item.getName() + " -- $" + item.getPrice());
        }
        System.out.println("Thank you for your order!");
    }
}
