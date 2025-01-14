// Define a functional interface Transformer<T> with a method T transform(T input) and use a lambda to reverse a string.

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> greetPrinter = name -> System.out.println("Hello, " + name);
        greetPrinter.accept("Alice");

        List<String> names = Arrays.asList("Bob", "Charlie", "David", "Eve");

        System.out.println("\nGreeting everyone:");
        names.forEach(greetPrinter);

        Consumer<String> upperCasePrinter = name -> System.out.println(name.toUpperCase());
        Consumer<String> combinedPrinter = greetPrinter.andThen(upperCasePrinter);

        System.out.println("\nWith chained consumers:");
        names.forEach(combinedPrinter);
    }
}