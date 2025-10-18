package in.Kshtriya;

public class  Car____AccessModifier {
    public String color;
    public String model;
     private double fuelLevel;
      long costOfPurchase;


     public Car____AccessModifier(){

     }

    public Car____AccessModifier(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }
}
