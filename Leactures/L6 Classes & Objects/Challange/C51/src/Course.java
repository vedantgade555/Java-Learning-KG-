/* Design a Course class.
• Instance variables: courseName, enrolledStudents.
• Static variable: maxCapacity, the maximum number of students for any course.
• Instance methods: enrollStudent(String studentName), unenrollStudent(String studentName).
• Static method: setMaxCapacity(int capacity), to set the maximum capacity for courses */
public class Course {

    static int maxCapacity=100;

     String courseName;
     int enrollments;

     String[] enrolledStudent= new String[maxCapacity];


     Course(String courseName){
         this.courseName=courseName;
         this.enrollments=0;
     }


     static void setMaxCapacity(int maxCapacity){
         Course.maxCapacity=maxCapacity; // We dont use this bcoz maxCapacity is the static variable
     }

     void enrollStudent(String studentName){
         enrolledStudent[enrollments]= studentName;
         enrollments++;
     }

     void unEnrolledStudent(String studentName){
         System.out.println("Student Remove");
         enrollments--;
     }

}
