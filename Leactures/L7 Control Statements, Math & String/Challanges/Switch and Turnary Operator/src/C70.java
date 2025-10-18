 /* Define a Student class with fields like name and age, and use
        toString to print student details. */
class Student {
    String name;
    int age;
    String rollNumber;
    String house;

    public Student(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Details: {name: "+ name
                +" ,age:"+ age
                +",roll Number: "+rollNumber
                +",house: "+house+"}";
    }

    public static void main(String[] args) {
        Student stu = new Student("Vedant",20,"001","Red");
        System.out.println(stu);
    }
}
