package INHERITANCE;

public class Vehicle {
//    public int numberOfTires;
   protected  int numberOfTires;

    public void commuts(){
        System.out.printf("I am going from place A to place B using %d tires \n",numberOfTires);
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    @Override
    public String toString() {
        return "Vehicle no of tires: "+ numberOfTires;
    }
}
