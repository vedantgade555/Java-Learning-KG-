package AccessModifier;

import in.Kshtriya.Car____AccessModifier;

public class AccessTest {
    public static void main(String[] args) {
        Car____AccessModifier car = new Car____AccessModifier();
        car.color="Red";
        car.model="Thar";
        System.out.println(car);
        // car.costOfPurchase = 7654; we cannot access costOfPurchase cannot access bcoz this is private

        Car____AccessModifier newCar = new Car____AccessModifier("Black","BMW",1,5000);
        System.out.println(newCar);
    }
}
