package Enums;

public enum TrafficLight {
    RED("Stop"),YELLOW("Ready"),GREEN("GO");

    private final String action;

    TrafficLight(String action) {
        this.action = action;
    }
}
