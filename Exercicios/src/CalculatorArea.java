
import java.util.Scanner;

public class CalculatorArea {
    public static void main(String[] args) {
        Scanner calculateArea = new Scanner(System.in);

        int choice = 0;

        while (choice != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. calculate area of square");
            System.out.println("2. calculate area of circle");
            System.out.println("3. out");
            System.out.print("choice an option: ");
            choice = calculateArea.nextInt();
            if (choice == 1) {
                System.out.print("enter the side of square: ");
                double side = calculateArea.nextDouble();
                double areaOfSquare = side * side;
                System.out.println("area of square: " + areaOfSquare);
            }

            else if (choice == 2) {
                System.out.print("Enter the radius of the circle: ");
                double radius = calculateArea.nextDouble();
                double areaOfCircle = 3.14 * radius * radius;
                System.out.println("area of circle: " + areaOfCircle);
            }

            else if (choice == 3) {
                System.out.println("program closed");
            }

            else {
                System.out.println("invalid option try again");
            }
        }
    }
}
