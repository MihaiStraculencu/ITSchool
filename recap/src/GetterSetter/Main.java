package GetterSetter;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Tesla", "red", 2020);

        car.setColor("blue");
        car.setPrice(-2000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
