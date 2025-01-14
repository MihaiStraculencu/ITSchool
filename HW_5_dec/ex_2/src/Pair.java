public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Pair() {
    }

    // getter key
    public K getKey() {
        return key;
    }

    // setter key
    public void setKey(K key) {
        this.key = key;
    }

    // getter value
    public V getValue() {
        return value;
    }

    // setter value
    public void setValue(V value) {
        this.value = value;
    }

    // toString for easy printing
    @Override
    public String toString() {
        return "Pair{key=" + key + ", value=" + value + "}";
    }
}