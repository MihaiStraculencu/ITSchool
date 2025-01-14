public class Main {
    public static void main(String[] args) {
        // container Integers
        Container<Integer> intContainer = new Container<>();
        intContainer.add(4);
        intContainer.add(2);
        intContainer.add(22);
        System.out.println("Integer Container Sum: " + intContainer.sum());

        // container Doubles
        Container<Double> doubleContainer = new Container<>();
        doubleContainer.add(2.5);
        doubleContainer.add(2.3);
        doubleContainer.add(3.7);
        System.out.println("Double Container Sum: " + doubleContainer.sum());

        // container Floats
        Container<Float> floatContainer = new Container<>();
        floatContainer.add(1.0f);
        floatContainer.add(4.0f);
        floatContainer.add(5.0f);
        System.out.println("Float Container Sum: " + floatContainer.sum());
    }
}