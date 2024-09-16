public class Main {
    public static void main(String[] args) {
        System.out.println("This is Screen Match");
        System.out.println("Movie: Top Gun: Maverick");
        int yearOfRelease = 2022;
        System.out.println("Year of release: " + yearOfRelease);
        boolean incluideInPlan = true;
        double noteMovie = 8.1;
        double average = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(average);
        String sinopse = """
                Movie Top Gun
                Adventure film with 80s heartthrob
                year of release:
                """ + yearOfRelease;
        System.out.println(sinopse);
        int classification = (int) (average / 2);
        System.out.println("stars:" + classification);
    }
}
