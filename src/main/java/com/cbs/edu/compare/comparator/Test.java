package com.cbs.edu.compare.comparator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Gleb1", 25),
                new Employee("Ivan", 28),
                new Employee("Anna", 21),
                new Employee("Maksim", 35)
        );

        System.out.println(employees);

        Collections.sort(employees, new EmployeeByNameComparator());

        /*Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee empOne, Employee empTwo) {
                return empOne.age - empTwo.age;
            }
        });*/

        Comparator<Employee> byAgeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee empOne, Employee empTwo) {
                return empOne.age - empTwo.age;
            }
        };

        Collections.sort(employees, byAgeComparator);

        class ByNameComparator implements Comparator<Employee> {

            @Override
            public int compare(Employee empOne, Employee empTwo) {
                return empOne.age - empTwo.age;
            }
        }

        Collections.sort(employees, new ByNameComparator());

        System.out.println(employees);
    }

    public static class Employee {
        String name;
        int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
