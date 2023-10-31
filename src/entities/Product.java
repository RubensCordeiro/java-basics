package entities;

public class Product {
    private String name;
    private final double price;
    private int quantity;

    public Product() {
        this.price = 999;
        this.quantity = 999;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int setQuantity(int quantity) {
        this.quantity = quantity;
        return this.quantity;
    }

    public double totalValueInStock() {
        return this.quantity * this.price;
    }

    public void addProducts(int quantity) {
        this.quantity = +quantity;
    }

    public void removeProducts(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
        } else {
            this.quantity = 0;
        }
    }

    public String toString() {
        return this.name
                + ", "
                + "whose price is $" + this.price
                + " and whose quantity is $" + this.quantity;
    }
}
