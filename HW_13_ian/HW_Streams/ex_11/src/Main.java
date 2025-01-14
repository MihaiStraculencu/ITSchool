// Create a list of unique integers (remove duplicates) from an existing list using distinct().

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 4);

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .toList();

        System.out.println(uniqueNumbers);
    }
}
