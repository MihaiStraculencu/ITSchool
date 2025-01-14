import java.util.List;

public class ListUtils {
    // count elements greater than a given element
    public static <T extends Comparable<T>> int countGreaterThan(List<T> list, T element) {
        int count = 0;
        for (T item : list) {
            //  compareTo method to check if item is greater
            if (item.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }
}