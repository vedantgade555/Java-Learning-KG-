package Multithreading.Sleep;

public class TestingSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before Sleep");
        Thread.sleep(5000);
        System.out.println("Woke up");
    }
}
