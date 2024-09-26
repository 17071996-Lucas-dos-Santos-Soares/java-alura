package Excersizepoo;

public class MainAgePeople {
    public static void main(String[] args) {
        AgePeople person1 = new AgePeople();
        person1.setName("Rafael");
        person1.setAge(19);

        AgePeople person2 = new AgePeople();
        person2.setName("Karoline");
        person2.setAge(21);

        System.out.println(person1.getName() +" is " +person1.getAge() +" years old ");
        System.out.println(person2.getName() +" is " +person2.getAge() +" years old");
    }
}
