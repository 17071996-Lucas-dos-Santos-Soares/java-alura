public class Name1 {
    public static void main(String[] args) {
        String name = "Jhon";
        int classRoom = 4;
        String message = """
                 Hello, %s!
                Well come to the java course
                will have %d classes to show you
                what it takes for you to take
                your first dive into the language!
                """.formatted(name, classRoom);
        System.out.println(message);
    }
}
