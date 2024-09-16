import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner readNum = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = readNum.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = readNum.nextInt();

        if (num1 == num2) {
            System.out.println("the numbers are the same");
        }
        else if (num1 > num2) {
            System.out.println("the first number is greater than the second");
        }
        else {
            System.out.println("the second number is greater than the first");
        }
    }
}
