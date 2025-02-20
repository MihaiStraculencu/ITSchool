package ocp;

public class DiscountCalculator {
    public double calculateDiscount(String customerType, double price) {
        return switch (customerType) {
            case "Regular" -> new RegularCustomer().calculateDiscount(price);
            case "VIP" -> new VIPCustomer().calculateDiscount(price);
            default -> 0;
        };
    }
}
