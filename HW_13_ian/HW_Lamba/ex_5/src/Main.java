// Use a lambda expression with Function<String, Integer> to find the length of a string.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = String::length;

        String test = "Hello World";
        System.out.println("Length of '" + test + "': " + stringLength.apply(test));

        List<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Programming");
        words.add("Lambda");
        words.add("Function");

        System.out.println("\nlist of words:");
        for (String word : words) {
            int length = stringLength.apply(word);
            System.out.println("'" + word + "' has length: " + length);
        }

        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, Integer> upperCaseLength = toUpperCase.andThen(stringLength);

    }
}