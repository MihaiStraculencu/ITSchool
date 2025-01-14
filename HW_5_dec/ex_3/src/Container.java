import java.util.ArrayList;
import java.util.List;

public class Container<T extends Number> {
    // list to store elements of type T (must extend Number)
    private final List<T> elements;

    // constructor
    public Container() {
        this.elements = new ArrayList<>();
    }

    // add an element
    public void add(T element) {
        elements.add(element);
    }

    // get an element by index
    public T get(int index) {
        return elements.get(index);
    }

    // calculate sum of all elements
    public double sum() {
        double total = 0.0;
        for (T element : elements) {
            total += element.doubleValue();
        }
        return total;
    }

    // get the number of elements
    public int size() {
        return elements.size();
    }
}