package Excersizepoo;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(123);
        account.setBallance(5000);
        account.holder = "Jhon";

        System.out.println("number account: " +account.getAccountNumber());
        System.out.println("balance: " +account.getBallance());
        System.out.println("holder: " +account.holder);

        account.setBallance(8000);
        System.out.println("new balance: " +account.getBallance());
    }
}
