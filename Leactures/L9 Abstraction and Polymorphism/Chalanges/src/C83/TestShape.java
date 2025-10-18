package C83;

public class TestShape {
    public static void main(String[] args) {
//        Shape shape = new Shape() {
//            @Override
//            public double calculateArea() {
//                return 0;
//            }
//        }

        Circle cir = new Circle(5);
        Square sq = new Square(10.3);

        System.out.printf("Area of circle is %f \n",cir.calculateArea());
        System.out.printf("Area of Square is %f",sq.calculateArea());
    }
}
