package Excersizepoo;

public class Car {
    String model;
    int year;
    String color;

    void showTechnicalSheets() {
        System.out.println("Model: " +model);
        System.out.println("year: " +year);
        System.out.println("color: " +color);
    }

    int calculateAge() {
        return 2024 - year;
    }
}