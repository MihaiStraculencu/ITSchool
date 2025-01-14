public class Main {
    public static void main(String[] args) {
        // enum methods
        for (Season season : Season.values()) {
            System.out.println(season + ":");
            System.out.println("  Average Temperature: " + season.getAverageTemperature() + "°C");
            System.out.println("  Description: " + season.getDescription());
            System.out.println();
        }

        // using a specific season
        Season currentSeason = Season.SUMMER;
        System.out.println("Current Season: " + currentSeason);
        System.out.println("Temperature: " + currentSeason.getAverageTemperature() + "°C");
    }
}