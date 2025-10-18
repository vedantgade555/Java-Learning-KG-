package C77.utils;

import C77.geometry.Circle;
import C77.geometry.Rectangle;

//import C77.geometry.*;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10,5);

        double cirArea = Math.PI*Math.pow(cir.radius,2);
        double rectArea = rect.length*rect.breadth;

        System.out.printf("Area of the circle is %f \n and Area of rectangle is %f",cirArea,rectArea);
    }
}
