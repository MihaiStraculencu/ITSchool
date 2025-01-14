// Count the number of strings in a list that are longer than 5 characters.

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("mar", "banana", "strugure", "kiwi", "mango", "lamaie");

        long count = strings.stream()
                .filter(s -> s.length() > 5)
                .count();

        System.out.println(count);
    }
}
