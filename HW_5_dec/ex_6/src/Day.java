public enum Day {
    MONDAY("Weekday"),
    TUESDAY("Weekday"),
    WEDNESDAY("Weekday"),
    THURSDAY("Weekday"),
    FRIDAY("Weekday"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    private final String type;

    // Constructor
    Day(String type) {
        this.type = type;
    }

    // check if the day is a weekday
    public boolean isWeekday() {
        return this.type.equals("Weekday");
    }

    // check if the day is a weekend
    public boolean isWeekend() {
        return this.type.equals("Weekend");
    }

    // get the day type
    public String getDayType() {
        return this.type;
    }
}