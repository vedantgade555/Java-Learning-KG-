package Challanges.C102;

public enum TrafficColor {
    RED(9000),
    YELLOW(10000),
    GREEN(11000);

    public int getOnTimeInMills() {
        return onTimeInMills;
    }

    private int onTimeInMills;

    TrafficColor(int onTimeInMills)
    {
        this.onTimeInMills = onTimeInMills;
    }

}
