public class Item {
    private String name;
    private double price;
    private int index;

    // Constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getIndex() {
        return index;
    }

    // Setter
    public void setIndex(int index) {
        this.index = index;
    }
}

