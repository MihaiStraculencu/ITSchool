public enum Season {
    SPRING(15.0, "I love working in the spring."),
    SUMMER(25.0, "I love working in the summer."),
    AUTUMN(10.0, "I love working in the autumn."),
    WINTER(0.0, "I love working in the winter.");

    private final double averageTemperature;
    private final String description;

    // constructor
    Season(double averageTemperature, String description) {
        this.averageTemperature = averageTemperature;
        this.description = description;
    }

    // getter for average temperature
    public double getAverageTemperature() {
        return averageTemperature;
    }

    // getter for description
    public String getDescription() {
        return description;
    }}

