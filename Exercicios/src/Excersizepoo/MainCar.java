package Excersizepoo;

public class MainCar {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.model = "fiat palio";
        mycar.year = 2015;
        mycar.color = "red";

        mycar.showTechnicalSheets();

        System.out.println("age of the car: " +mycar.calculateAge() +" years");
    }
}
