package GetterSetter;

public class Car {
    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    private final String model;
    private String color;
    private int price;

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("Invalid price");
        } else {
            System.out.println("The price is " + price);
        }
    }


    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

}
