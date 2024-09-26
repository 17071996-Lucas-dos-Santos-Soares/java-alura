package Excersizepoo;

public class Music {
    String title;
    String artist;
    double sumOfAvaliation;
    int numberOfAvaliation;
    int yearOfRelease;

    void showTechnicallsheets() {
        System.out.println("title of song: " +title);
        System.out.println("artist: " +artist);
        System.out.println("year of release: " +yearOfRelease);
    }

    void avaliation(double note) {
        sumOfAvaliation += note;
        numberOfAvaliation++;
    }

    double averageOfAvaliantions() {
        return sumOfAvaliation / numberOfAvaliation;
    }
}
