// Sort a list of integers in ascending order using an anonymous class for the comparator.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);

        System.out.println("Original list: " + numbers);

        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1.compareTo(num2);
            }
        });

        System.out.println("Sorted list: " + numbers);
    }
}