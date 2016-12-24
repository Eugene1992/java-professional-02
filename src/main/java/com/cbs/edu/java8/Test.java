package com.cbs.edu.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 23, 50000, Employee.Gender.MALE);
        Employee emp2 = new Employee("Anna", 17, 14000, Employee.Gender.FEMALE);
        Employee emp3 = new Employee("Maksim", 53, 132000, Employee.Gender.MALE);
        Employee emp4 = new Employee("Egor", 67, 12000, Employee.Gender.MALE);
        Employee emp5 = new Employee("Galina", 26, 73000, Employee.Gender.FEMALE);
        Employee emp6 = new Employee("Tanya", 32, 47000, Employee.Gender.FEMALE);
        Employee emp7 = new Employee("Rostislav", 18, 5000, Employee.Gender.MALE);
        Employee emp8 = new Employee("Mark", 45, 33000, Employee.Gender.MALE);
        Employee emp9 = new Employee("Lena", 65, 40000, Employee.Gender.FEMALE);
        Employee emp10 = new Employee("Artem", 54, 7000, Employee.Gender.MALE);

        List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10);

        printSortedEmployeesBySalary(employees);
    }

    public static List<Employee> getEmployeByAgeInterval(List<Employee> input, int from, int to) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : input) {
            if (employee.getAge() > 18 && employee.getAge() < 35) {
                result.add(employee);
            }
        }
        return result;
    }

    // e -> e.getAge() > 18 && e.getAge() < 35
    public static List<Employee> getEmployeByAgeInterval8(List<Employee> input, final int from, int to) {
        return input
                .stream()
                .filter(e -> e.getAge() > from && e.getAge() < to)
                .peek(e -> e.setSalary(e.getSalary() + 100))
                .collect(Collectors.toList());
    }

    public static void printAllChangedEmployee(List<Employee> input, final int from, int to) {
        input
                .stream()
                .filter(e -> e.getAge() > from && e.getAge() < to)
                .filter(e -> e.getGender() == Employee.Gender.FEMALE)
                .peek(e -> e.setSalary(e.getSalary() + 100))
                .forEach(new Consumer<Employee>() {
                    @Override
                    public void accept(Employee x) {
                        System.out.println(x);
                    }
                });
    }

    public static long countFeemales(List<Employee> input) {
        return input
                .stream()
                .filter(e -> e.getGender() == Employee.Gender.FEMALE)
                .count();
    }

    public static void printSortedEmployeesBySalary(List<Employee> input) {
        input
                .stream()
                .sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee e1, Employee e2) {
                        return e1.getSalary() - e2.getSalary();
                    }
                })
                .forEach(new Consumer<Employee>() {
                    @Override
                    public void accept(Employee e) {
                        System.out.println(e);
                    }
                });
    }
}
