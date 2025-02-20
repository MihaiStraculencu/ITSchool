public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;
    public Student(String name, int age, double gpa, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }

    void study() {
        System.out.println(name + " is studying");
    }

}
