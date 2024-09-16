public class Conditinal {
    public static void main(String[] args) {
        int yearOfRelease = 1986;
        boolean incluideInPlan = true;
        double noteMovie = 8.1;
        String typeOfPlan = "plus";
        if (yearOfRelease >= 2022) {
            System.out.println("movie releases that customers like");
        }
        else {
            System.out.println("good old movies");
        }
        if (incluideInPlan == true && typeOfPlan.equals("plus")) {
            System.out.println("film release");
        }
        else {
            System.out.println("Do you want to rent this movie?");
        }
    }
}
