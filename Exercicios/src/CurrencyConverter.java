public class CurrencyConverter {
    public static void main(String[] args) {
        double valueInDolars = 100.50;
        double conversionRate = 4.94;
        double valueInBlr = valueInDolars * conversionRate;
        System.out.println("the value in R$ is : " +valueInBlr);
    }
}
