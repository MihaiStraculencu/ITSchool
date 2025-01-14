public class Main {
    public static void main(String[] args) {
        // Pair with Integer key and String value
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        System.out.println("Pair 1: Key: " + pair1.getKey() + ", Value: " + pair1.getValue());

        // Pair with String key and Double value
        Pair<String, Double> pair2 = new Pair<>();
        pair2.setKey("Length");
        pair2.setValue(23.11);
        System.out.println("Pair 2: Key: " + pair2.getKey() + ", Value: " + pair2.getValue() + "cm");

        // Pair using constructor
        Pair<String, Integer> pair3 = new Pair<>("Cars", 10);
        System.out.println(pair3);
    }
}