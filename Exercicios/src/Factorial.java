import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner fac = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = fac.nextInt();
        int factorial = 1;

        for (int index = 1; index <= num; index++) {
            factorial *= index;
        }
        System.out.println("the factorial of " +num + " is " +factorial);
    }
}
