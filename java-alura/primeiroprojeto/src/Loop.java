import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double average = 0;
        double note = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("give your rating for this movie");
            note = read.nextDouble();
            average += note;
        }
        System.out.println("Average ratings " + average/3);
    }
}
