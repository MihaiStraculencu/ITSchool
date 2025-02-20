package ocp;

class RegularCustomer implements DiscountStrategy {
    public double calculateDiscount(double price) {
        return price * 0.5;
    }
}
