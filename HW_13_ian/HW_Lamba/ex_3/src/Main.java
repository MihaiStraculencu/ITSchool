// Use a lambda with Predicate<Integer> to check if a number is greater than 10.

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> greaterThanTen = num -> num > 10;
        int[] numbers = {5, 15, 8, 20, 3, 12};

        for (int num : numbers) {
            boolean result = greaterThanTen.test(num);
            System.out.println(num + " > 10: " + result);
        }

        Predicate<Integer> lessThanFifteen = num -> num < 15;
        Predicate<Integer> betweenTenAndTwenty = greaterThanTen.and(lessThanFifteen);

        System.out.println("\nTesting numbers between 5 and 15:");
        for (int num : numbers) {
            boolean result = betweenTenAndTwenty.test(num);
            System.out.println(num + " este intre 5 si 15 " + result);
        }
    }
}