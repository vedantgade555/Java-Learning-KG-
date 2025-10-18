/* Create a class Person with attributes name and age. Override
equals() to compare Person objects based on their attributes.
Override hashCode() consistent with the definition of equals(). */

package C81;

public class C80 {
    public static void main(String[] args) {
        Person person1 = new Person("Ram",20);
        Person person2 = new Person("Ram",20);


        if(person1.equals(person2)){
            System.out.println("Same");
        }
        else {
            System.out.println("Different");
        }
    }
}
