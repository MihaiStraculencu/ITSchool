import java.util.ArrayList;
import java.util.List;

public class ShapeContainer<T extends Shape> {
    private final List<T> shapes = new ArrayList<>();

    // add a shape
    public void addShape(T shape) {
        shapes.add(shape);
    }

    // add multiple shapes from a list
    public void addShapes(List<? extends T> shapeList) {
        shapes.addAll(shapeList);
    }

    // print all shapes
    public void printShapes() {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    // calculate total area of shapes
    public double getTotalArea(List<? super T> shapeList) {
        double totalArea = 0;
        for (Object obj : shapeList) {
            if (obj instanceof Shape) {
                totalArea += ((Shape) obj).getArea();
            }
        }
        return totalArea;
    }

    public int getShapeCount() {
        return shapes.size();
    }
}