package ocp;

/**
 * Refactor the DiscountCalculator class to follow OCP using interfaces or abstract classes.
 * Add a new customer type (e.g., "Student") without modifying the existing logic.
 */

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        double price = 100.0;

        System.out.println("RC Discount: " +
                calculator.calculateDiscount("Regular", price));
        System.out.println("VIP Discount: " +
                calculator.calculateDiscount("VIP", price));
    }
}
