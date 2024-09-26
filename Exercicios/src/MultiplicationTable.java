import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner tabble = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = tabble.nextInt();
        System.out.println("multiplication table of " +number + ":");

        for (int index = 1; index <= 10; index++) {
            System.out.println(number + "x" + index + " = " + (number * index));
        }
    }
}
