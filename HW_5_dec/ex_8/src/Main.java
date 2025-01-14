public class Main {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;
        for (int i = 0; i < 6; i++) {
            System.out.println(light);
            light = light.next();
        }
    }
}