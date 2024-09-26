package Excersizepoo;

public class Product {
    private String name;
    private double price;

    public void product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount (double percentage) {
        double discount = price * (percentage / 100);
        price -= discount;
    }
}
