import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void displayFormattedDateTime() {
        // Current date and time
        LocalDateTime now = LocalDateTime.now();

        // Formats and their descriptions
        String[] formatNames = {
                "Day-Month-Year",
                "Month/Day/Year",
                "Year.Month.Day",
                "24-hour Time",
                "12-hour Time",
                "Full Date"
        };

        DateTimeFormatter[] formatters = {
                DateTimeFormatter.ofPattern("dd-MM-yyyy"),
                DateTimeFormatter.ofPattern("MM/dd/yyyy"),
                DateTimeFormatter.ofPattern("yyyy.MM.dd"),
                DateTimeFormatter.ofPattern("HH:mm:ss"),
                DateTimeFormatter.ofPattern("hh:mm:ss a"),
                DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy")
        };

        // Print formatted dates
        System.out.println("Current Date and Time Formats:");
        for (int i = 0; i < formatNames.length; i++) {
            System.out.printf("%-20s: %s%n", formatNames[i], now.format(formatters[i]));
        }
    }
}
