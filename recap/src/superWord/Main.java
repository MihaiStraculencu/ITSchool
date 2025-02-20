package superWord;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        person.showName();

        Student student = new Student("Mihai", "Andrei", 3.8);
        student.showName();
        student.showGPA();

        Employee employee = new Employee("Cotei", "Robert", 5000);
        employee.showName();
        employee.showSalary();
    }
}
