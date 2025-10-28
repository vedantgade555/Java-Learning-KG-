package Challanges.C114;

import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Vedant",100),
                new Employee("Pramod",80),
                new Employee("Rohan",90)
        );

        employees.stream()
                .sorted(emp1,emp2 ->Integer.compare(emp1.getSalary(),emp2.getSalary()))
    }
}
