import java.util.Scanner;

/* Calculate the area and circumference of a circle for a given radius
using Math.PI */
class areaCircle {

    double radius;

    areaCircle(double radius){
        this.radius=radius;
    }
    double getCircumference(){
        return 2*radius*Math.PI;
    }

    double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle Properties ="+radius+" ,Area :"+getArea()+", Circumference : "+ getCircumference();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius");
        double radius = input.nextDouble();
        areaCircle circle= new areaCircle(radius);
        System.out.println(circle);
    }
}
