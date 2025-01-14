// Sort a list of integers in descending order using sorted().

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted((a, b) -> b - a)
                .toList();

        System.out.println(sortedNumbers);
    }
}
