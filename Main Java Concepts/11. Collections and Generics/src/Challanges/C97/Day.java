package Challanges.C97;

public enum Day {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType() {
        return isWeekday ? "Week Day" : "Week End";
    }

    // Optional main method to test
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + " → " + day.getType());
        }
    }
}
