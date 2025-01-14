// Define a functional interface StringCombiner with a method String combine(String s1, String s2) and use a lambda to concatenate two strings with a space in between.
@FunctionalInterface
interface StringCombiner {
    String combine(String s1, String s2);
}

class StringCombinerImpl implements StringCombiner {
    @Override
    public String combine(String s1, String s2) {
        return s1 + " " + s2;
    }
}

public class Main {
    public static void main(String[] args) {
        StringCombiner combiner = new StringCombinerImpl();

        String result1 = combiner.combine("Hello", "World");
        System.out.println(result1);

        String result2 = combiner.combine("Java", "Programming");
        System.out.println(result2);

        StringCombiner lambdaCombiner = (s1, s2) -> s1 + " " + s2;
        System.out.println(lambdaCombiner.combine("Interface", "Example"));

        printCombinedStrings("First", "Second", combiner);
    }

    public static void printCombinedStrings(String s1, String s2, StringCombiner combiner) {
        System.out.println("Combined result: " + combiner.combine(s1, s2));
    }
}