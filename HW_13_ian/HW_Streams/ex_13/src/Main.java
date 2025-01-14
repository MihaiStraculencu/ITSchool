//Create a list of strings, filter out strings containing the letter "a", and collect the remaining strings into a new list.

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("mar", "banana", "tort", "kiwi", "ulei", "joc");

        List<String> filteredStrings = strings.stream()
                .filter(s -> !s.contains("a"))
                .toList();

        System.out.println(filteredStrings);
    }
}
