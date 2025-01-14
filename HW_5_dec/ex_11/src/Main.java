import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter first date (dd-MM-yyyy): ");
        String firstDate = scanner.nextLine();

        System.out.print("Enter second date (dd-MM-yyyy): ");
        String secondDate = scanner.nextLine();

        // Call utility method to calculate and display the difference
        DateCalc.calculateDateDifference(firstDate, secondDate);

        scanner.close();
    }
}
