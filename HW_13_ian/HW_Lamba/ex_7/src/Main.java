// Use the built-in Predicate<Integer> functional interface to check if a number is even.

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        int testNumber = 4;
        System.out.println(testNumber + " is even: " + isEven.test(testNumber));


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("\nTest numbers:");
        for (Integer num : numbers) {
            if (isEven.test(num)) {
                System.out.println(num + " is even");
            }
        }


        System.out.println("\nEven numbers using stream:");
        numbers.stream()
                .filter(isEven)
                .forEach(System.out::println);
    }


    public static void printIfEven(Integer number, Predicate<Integer> predicate) {
        if (predicate.test(number)) {
            System.out.println(number + " is even");
        }
    }
}