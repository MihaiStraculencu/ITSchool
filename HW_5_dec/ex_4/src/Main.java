import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create individual shapes
        Circle circle1 = new Circle("first circle", 5);
        Circle circle2 = new Circle("second circle", 3);
        Rectangle rect1 = new Rectangle("first rectangle", 4, 6);
        Rectangle rect2 = new Rectangle("second rectangle", 3, 5);

        // Create a ShapeContainer for Circles
        ShapeContainer<Circle> circleContainer = new ShapeContainer<>();
        circleContainer.addShape(circle1);
        circleContainer.addShape(circle2);

        // Create a list of circles to add
        List<Circle> circleList = new ArrayList<>();
        circleList.add(new Circle("third circle", 2));
        circleList.add(new Circle("forth circle", 4));

        // Add multiple circles using wildcard method
        circleContainer.addShapes(circleList);

        // Print all circles
        System.out.println("Circles:");
        circleContainer.printShapes();

        // Create a ShapeContainer for Rectangles
        ShapeContainer<Rectangle> rectangleContainer = new ShapeContainer<>();
        rectangleContainer.addShape(rect1);
        rectangleContainer.addShape(rect2);

        // Create a list to demonstrate lower bounded wildcard
        List<Shape> allShapes = new ArrayList<>();
        allShapes.add(circle1);
        allShapes.add(rect1);

        // Calculate total area using lower bounded wildcard
        System.out.println("\nTotal Shapes: " +
                rectangleContainer.getTotalArea(allShapes));
    }
}