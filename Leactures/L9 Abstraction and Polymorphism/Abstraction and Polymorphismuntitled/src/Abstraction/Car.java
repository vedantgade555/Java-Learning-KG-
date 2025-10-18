package Abstraction;

public class Car extends Vehicle {
    private int noOfDoors;

    public Car() {
        super();
    }

    @Override
    public void makeStartSound() {
        System.out.println("Noise .. dug dug");

    }

    public Car(int noOfTires) {
        super(4);
    }
}
