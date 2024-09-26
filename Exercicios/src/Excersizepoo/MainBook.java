package Excersizepoo;

public class MainBook {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Introduction to Algorithms, Fourth Edition");
        book1.setAutor("\nThomas H Cormen, Charles and Leiserson");

        Book book2 = new Book();
        book2.setTitle("Harry Potter and prisoner of azkaban");
        book2.setAutor("\nJ.K Roling");

        book1.showDetails();
        book2.showDetails();
    }
}
