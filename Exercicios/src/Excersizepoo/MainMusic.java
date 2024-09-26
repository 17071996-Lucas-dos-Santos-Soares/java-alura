package Excersizepoo;

public class MainMusic {
    public static void main(String[] args) {
        Music mymusic = new Music();
        mymusic.title = "hans zimmer";
        mymusic.artist = "Alan Walker";
        mymusic.yearOfRelease = 2024;

        mymusic.showTechnicallsheets();
        mymusic.avaliation(8.1);
        mymusic.avaliation(7.5);
        mymusic.avaliation(9.0);

        double average = mymusic.averageOfAvaliantions();
        System.out.println("the average of avaliations: " +average);
    }
}
