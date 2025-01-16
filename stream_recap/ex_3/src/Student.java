//1. Create a Student class with the following attributes:
//
//        - int id
//        - String name
//        - double grade
//
//        - Implement Comparable<Student> to sort students by grade.
//        - Override equals and hashCode to ensure two students are distinct if their id is different.
//        - Create a List<Student> with at least 10 students (some with the same grade or name).
//
//        – Use a stream to:
//        -- Filter students with a grade higher than a given threshold.
//        -- Sort the students by grade using the natural order (Comparable).
//        -- Collect the sorted students into a new list.

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private final int id;
    private final String name;
    private final double grade;

    // constr
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // getteri
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    //compare students by grade
    @Override
    public int compareTo(Student other) {
        return Double.compare(this.grade, other.grade);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", nume='" + name + "', nota=" + grade + "}";
    }

    //main
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "Ana", 8.5),
                new Student(2, "Ion", 9.2),
                new Student(3, "Mihai", 7.8),
                new Student(4, "Elena", 8.8),
                new Student(4, "Andrei", 8.1),
                new Student(5, "Robert", 4.1)
        );

        double notaMinima = 5.0;

        List<Student> filteredSortedStudents = students.stream()
                .filter(student -> student.getGrade() >= notaMinima && student.getGrade() <= 10)
                .sorted()
                .toList();

        filteredSortedStudents.forEach(System.out::println);
    }
}
