package com.example.demo.javacode.stepicStream;


import java.util.List;

/**
 *Ваша задача — реализовать метод, вычисляющий общее количество сотрудников с окладом >= порога
 * для всех отделов, код которых начинается со строки «111-» (без «»).
 * Попробуйте применить свои знания о Stream API и особенно о методе flatMap, чтобы обеспечить реализацию.
 */
class EmployeesCounter {
    public static void main(String[] args) {
        List<Department> departments = List.of(
                new Department("dep-1", "111-1", List.of(
                        new Employee("William", 15000L),
                        new Employee("Sophia", 22000L),
                        new Employee("John", 20000L)
                )),
                new Department("dep-2", "222-1", List.of(
                        new Employee("Victor", 25000L)
                ))
        );

        System.out.println("Number calculated:" + EmployeesCounter.calcNumberOfEmployees(departments, 17000L));
    }

    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        return departments.stream()
                .filter(code -> code.getCode().contains("111-"))
                .flatMap(sal -> sal.getEmployees().stream())
                .map(sal -> sal.getSalary())
                .filter(n -> n >= threshold)
                .count();
    }
}

class Employee {
    private final String name;
    private final Long salary;

    public Employee(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Department {
    private final String name;
    private final String code;
    private final List<Employee> employees;

    public Department(String name, String code, List<Employee> employees) {
        this.name = name;
        this.code = code;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", employees=" + employees +
                '}';
    }

}
