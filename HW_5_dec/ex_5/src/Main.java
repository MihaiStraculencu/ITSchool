import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Integer list
        List<Integer> intList = Arrays.asList(4,2,1,5,6,7,4,2);
        int intCount = ListUtils.countGreaterThan(intList, 2);
        System.out.println("Integers greater than 4: " + intCount);

        // String list
        List<String> stringList = Arrays.asList("car", "jump", "test", "ok");
        int stringCount = ListUtils.countGreaterThan(stringList, "haha");
        System.out.println("Strings greater than 'haha': " + stringCount);

        // Double list
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        int doubleCount = ListUtils.countGreaterThan(doubleList, 5.0);
        System.out.println("Doubles greater than 3.0: " + doubleCount);
    }
}