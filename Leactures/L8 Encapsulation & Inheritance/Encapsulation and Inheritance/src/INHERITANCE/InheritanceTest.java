package INHERITANCE;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        twoWheeler two = new twoWheeler();

        vehicle.commuts();
        two.commuts();
        two.balance();

        MotorCycle motor = new MotorCycle();
        motor.balance();
        motor.commuts();
        motor.start();

        vehicle.hashCode();
    }
}
