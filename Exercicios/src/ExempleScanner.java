import java.util.Scanner;

public class ExempleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type your name: ");
        String name = scanner.nextLine();
        System.out.println("type your age: ");
        int age = scanner.nextInt();
        System.out.println("What amount do you intend to invest this month? ");
        double value = scanner.nextDouble();
        System.out.println(name + " that has " + age + " years old " + " and will invest R$ " + value + " this month ");
    }
}
