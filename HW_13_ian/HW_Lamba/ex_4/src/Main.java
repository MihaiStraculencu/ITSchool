// Print all elements of a list using Consumer<String> and a lambda expression.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mar");
        fruits.add("Banana");
        fruits.add("Avocado");
        fruits.add("Mango");

        Consumer<String> printFruit = fruit -> System.out.println("Fruit: " + fruit);

        System.out.println("Printing fruits using consumer:");
        fruits.forEach(printFruit);

        Consumer<String> upperCase = fruit -> System.out.println(fruit.toUpperCase());
        Consumer<String> length = fruit -> System.out.println("Length: " + fruit.length());

        System.out.println("\nPrinting with chained consumers:");
        fruits.forEach(printFruit.andThen(upperCase).andThen(length));
    }
}