package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

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
        return this.name + ", " + "whose price is $" + this.price;
    }
}
