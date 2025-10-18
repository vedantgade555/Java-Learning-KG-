package Polymorphism.PassBy;

public class TestPassByReference {

    public static void main(String[] args) {
        Point first = new Point(4,8);
        System.out.println(first);
        move(first);
        System.out.println(first);

    }

    public static void move(Point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }


    public static class Point{
        int x;
        int y;

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
