public enum CoffeeSize {
    SMALL(8, 2.50),
    MEDIUM(12, 3.00),
    LARGE(16, 3.50);

    private final double price;

    CoffeeSize(int grams, double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}