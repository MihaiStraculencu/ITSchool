public class Main {
    public static void main(String[] args) {
        CoffeeSize size = CoffeeSize.MEDIUM;
        int quantity = 3;

        double totalCost = size.getPrice() * quantity;
        System.out.println("Total Cost: LEI" + totalCost);
    }
}