import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("enter your favorite movie:");
        String film = read.nextLine();
        System.out.println("What is the release year?");
        int yearOfRelease = read.nextInt();
        System.out.println("Tell us what you think of the film");
        double avaliation = read.nextDouble();
        System.out.println(film);
        System.out.println(yearOfRelease);
        System.out.println(avaliation);
    }
}