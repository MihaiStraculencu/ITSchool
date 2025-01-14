public class Main {
    public static void main(String[] args) {
        // Create a Box to store an Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(3);
        System.out.println(intBox.get());

        // Create a Box to store a String
        Box<String> stringBox = new Box<>();
        stringBox.set("box string");
        System.out.println(stringBox.get());

        // Clear the box
        stringBox.clear();
        System.out.println(stringBox.isEmpty());
    }
}