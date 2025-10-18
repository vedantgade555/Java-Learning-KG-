public class Car {
    // Instance Variable
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    static {
        noOfCarsSold=0;
    }

    {
        noOfCarsSold++;
    }

    Car(String color){
        this.color=color;
        noOfWheels=4;
        maxSpeed=150;
        currentFuelInLiters=5;
        noOfSeats=5;

    }

    Car(){
        this("Black");
    }

    Car(){
        this.color="Black";
        noOfWheels=4;
        maxSpeed=150;
        currentFuelInLiters=5;
        noOfSeats=5;
    }



// Instance Method

    public Car start() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out if fuel, can not start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode, please refuel");
        } else {
            System.out.println("Car is started.. bruhhhh.....");
        }

        return this;
    }

    public void drive() {
        currentFuelInLiters--;
        System.out.println("Car is driving");
    }











    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }


    // Finalize Method/
    // only we have to write finalize other code will auto Complete


    @Override
    protected void finalize() throws Throwable {
        System.out.println("I am finalize      ");
     }
}
