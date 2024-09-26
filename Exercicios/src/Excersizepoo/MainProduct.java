package Excersizepoo;

public class MainProduct {
    public static void main(String[] args) {
        Product iphone = new Product();
        iphone.setName("iphone 15");
        iphone.setPrice(15000);

        System.out.println("name of product: " +iphone.getName());
        System.out.println("price of product: " +iphone.getPrice());

        iphone.applyDiscount(10);
        System.out.println("new discounted price: " +iphone.getPrice());
    }
}
