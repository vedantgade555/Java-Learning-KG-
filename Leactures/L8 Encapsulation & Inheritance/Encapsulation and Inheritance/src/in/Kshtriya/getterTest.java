package in.Kshtriya;

import GetterSetter.Car;

public class getterTest {
    public static void main(String[] args) {
        Car car = new Car("Red","Maruti",3,8000);
        System.out.printf("%s %s",car.getColor(),car.getModel()) ;
    }
}
