package Abstraction;

public abstract class Vehicle implements Transport{
    private int noOfTires;

    public Vehicle() {

    }

    public abstract void makeStartSound(); // For child class compulsary to define this method

    @Override
    public void getSetGo() {
        System.out.println("Go into place");
    }

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute(){
        System.out.println("Going ..... ");
    }
}
