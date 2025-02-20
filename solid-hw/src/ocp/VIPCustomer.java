package ocp;

class VIPCustomer implements DiscountStrategy {
    public double calculateDiscount(double price) {
        return price * 1;
    }
}

