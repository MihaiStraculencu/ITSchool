public class Main {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + " is a " + day.getDayType() +
                    " (Weekday: " + day.isWeekday() +
                    ", Weekend: " + day.isWeekend() + ")");
        }

        Day today = Day.SATURDAY;
        System.out.println("\nToday (" + today + "):");
        if (today.isWeekend()) {
            System.out.println("weekend");
        } else {
            System.out.println("work");
        }
    }
}