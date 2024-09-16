import java.util.Scanner;

public class AnotherLoop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double average = 0;
        double note = 0;
        int totalNotes = 0;
        while (note != -1) {
            System.out.println("Give your rating for the movie or press -1 to end");
            note = read.nextDouble();
           if (note != -1) {
               average += note;
               totalNotes++;
           }
        }
        System.out.println("Average ratings " + average / totalNotes);
    }
    }
