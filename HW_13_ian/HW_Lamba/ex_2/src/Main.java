// Filter a list of strings to only include those starting with "A" using a lambda expression.

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Alina");
        names.add("Bogdan");
        names.add("Ana");
        names.add("Mihai");
        names.add("Andrei");
        names.add("Dan");

        System.out.println(names);

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("B"))
                .toList();

        System.out.println(filteredNames);
    }
}