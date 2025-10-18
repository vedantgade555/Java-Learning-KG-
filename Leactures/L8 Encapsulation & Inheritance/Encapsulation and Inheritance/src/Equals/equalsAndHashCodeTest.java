package Equals;

public class equalsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Vedant",20,"001");
        Person person2 = new Person("Vedant",20,"001");

        if(person1.equals(person2)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal ");
        }
    }
}
