import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String name = "Lucas";
        String accountType = "checking account";
        double balance = 1500.99;
        int option = 0;
        System.out.println("***********");
        System.out.println("\nName of client: " +name);
        System.out.println("\nAccount type: " + accountType);
        System.out.println("\nCurrent balance: " + balance);
        System.out.println("\n***********");
        String menu = """
                1. ** enter your option **
                2. transfer value
                3. check balance
                4. out
                """;
        Scanner read = new Scanner(System.in);
        while (option != 4) {
            System.out.println(menu);
            option = read.nextInt();

            if (option == 1) {
                System.out.println("the update balance is: " + balance);
            }
            else if (option == 2) {
                System.out.println("what amount do you want to transfer?");
                double value = read.nextDouble();
                if (value > balance) {
                    System.out.println("there is no balance to make the transfer");
                }
                else {
                    balance -= value;
                    System.out.println("new balance " + balance);
                }
            }
            else if (option == 3) {
                System.out.println("amount received");
                double value = read.nextDouble();
                value += balance;
                System.out.println("new balance " + balance);
            }
            else if (option != 4){
                System.out.println("invalid option");
            }
        }
    }
}
