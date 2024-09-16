import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("type one number");
        int number = read.nextInt();
        if (number > 0) {
            System.out.println("número positivo");
        } else {
            System.out.println("número negativo");
        }
    }
}
