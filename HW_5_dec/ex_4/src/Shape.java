public abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (Area: " + getArea() + ")";
    }
}