public class DiscountCalculation {
    public static void main(String[] args) {
        double originalPrice = 150.0;
        double percentageDiscount = 10.0;
        double valueDiscount = (percentageDiscount / 100.0) * originalPrice;
        double newPrice = originalPrice - valueDiscount;
        System.out.println("orignal price: R$: " + originalPrice);
        System.out.println("discount: " + valueDiscount);
        System.out.println("new price with discount: " + newPrice);
    }
}
