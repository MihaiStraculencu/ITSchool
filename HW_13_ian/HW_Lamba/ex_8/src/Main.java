// Use the built-in Consumer<String> functional interface to print strings prefixed with "Hello, ".

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> greetPrinter = name -> System.out.println("Hello, " + name);
        greetPrinter.accept("Mihai");

        List<String> names = Arrays.asList("Bogdan", "Claudiu", "Dan", "Ana");

        System.out.println("\nGreeting everyone:");
        names.forEach(greetPrinter);


        Consumer<String> upperCasePrinter = name -> System.out.println(name.toUpperCase());
        Consumer<String> combinedPrinter = greetPrinter.andThen(upperCasePrinter);

        System.out.println("\nWith chained consumers:");
        names.forEach(combinedPrinter);
    }

}