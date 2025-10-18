package INHERITANCE;

public class twoWheeler extends  Vehicle{
    protected twoWheeler(){
        numberOfTires = 2;
    }

    public void balance(){
        System.out.println("I am balancing on two tires");
    }
}
