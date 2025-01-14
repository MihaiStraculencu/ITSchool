import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class DateCalc {

    public static void calculateDateDifference(String firstDateInput, String secondDateInput) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate firstDate = LocalDate.parse(firstDateInput, dateFormatter);
            LocalDate secondDate = LocalDate.parse(secondDateInput, dateFormatter);

            Period difference = Period.between(firstDate, secondDate);

            System.out.printf("Difference: %d years, %d months, and %d days%n",
                    Math.abs(difference.getYears()),
                    Math.abs(difference.getMonths()),
                    Math.abs(difference.getDays()));

        } catch (Exception e) {
            System.out.println("Invalid date format. Please use 'dd-MM-yyyy'.");
        }
    }
}
 