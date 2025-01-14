// Concatenate all strings in a list into a single string, separated by commas.

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("aiurea", "atac", "explozie", "nvidia", "5090");

        String result = String.join(", ", strings);

        System.out.println("Concatenated string: " + result);
    }
}


