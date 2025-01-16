//Create an Employee class with:
//
//        - int id
//        - String name
//        - String department
//        - double salary
//
//        - Implement Comparable<Employee> to sort by salary in descending order.
//        - Override equals and hashCode to ensure employees are distinct based on id.
//        - Create a list of employees in multiple departments.
//
//        - Use streams to:
//        -- Calculate the average salary of employees per department.
//        -- Find the top 3 highest-paid employees across all departments.
//        -- Partition employees into two groups: those earning more than a given amount and those earning less.

import java.util.*;

public class Employee implements Comparable<Employee> {
    private final int id;
    private final String name;
    private final String department;
    private final double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    //getteri
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(other.salary, this.salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "mihai", "IT", 100),
                new Employee(2, "andrei", "HR", 650),
                new Employee(3, "robert", "IT", 850),
                new Employee(4, "alina", "Finance", 750),
                new Employee(5, "ahem", "HR", 550),
                new Employee(6, "wdaada", "Finance", 900)
        );

        System.out.println("\n3 highest paid employees:");
        employees.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
    }}