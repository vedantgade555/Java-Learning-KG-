package Challanges.C102;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficLightThread t1 = new TrafficLightThread(TrafficColor.RED);
        TrafficLightThread t2 = new TrafficLightThread(TrafficColor.YELLOW);
        TrafficLightThread t3 = new TrafficLightThread(TrafficColor.GREEN);

        t3.start();
        t3.join ();
        t2.start();
        t2.join();
        t1.start();

    }
}
