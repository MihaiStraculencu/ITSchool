package toStringRecap;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Tesla", "red", 2020, "black");
        Car car2 = new Car("Ford", "yellow", 2021, "white");
        Car car3 = new Car("Mercedes", "blue", 2022, "gray");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
