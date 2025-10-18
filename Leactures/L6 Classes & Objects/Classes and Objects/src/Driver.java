public class Driver {

    static int minAgeForDriving = 18;

   String name;
   String dataOfLicens;
   int age;

   public boolean isAllowToDive(){
       return this.age >= minAgeForDriving;
   }
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());

        Car swift = new Car("Red");
//        thar=null;
//        swift.addFuel(6);
//        swift.drive();
//        Car startCar= swift.start();
//        startCar.drive();
        swift.start().drive();
        System.out.println(swift.color);


//        Driver myDriver= new Driver();
//        myDriver.dataOfLicens="1Jan2025";
//        System.out.println(minAgeForDriving);

        Car thar = new Car();
        System.out.println(thar.color);
    }
}
