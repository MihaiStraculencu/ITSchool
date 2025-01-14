public class Box<T> {
    private T item;

    public void set(T newItem) {
        this.item = newItem;
    }

    public T get() {
        return this.item;
    }

    public void clear() {
        this.item = null;
    }

    public boolean isEmpty() {
        return this.item == null;
    }
}