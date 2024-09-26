import java.util.Scanner;

public class EveNorodd {
    public static void main(String[] args) {
        Scanner eveNor = new Scanner(System.in);
        System.out.println("enter an integer :");
        int number = eveNor.nextInt();
        if (number % 2 == 0) {
            System.out.println("the number is even");
        }
        else {
            System.out.println("the number is not even");
        }
    }
}
