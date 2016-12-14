package com.cbs.edu.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LostHashObject {

    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();

        Employee firstEmp = new Employee("Ivan", 20);
        Employee secondEmp = new Employee("Maksim", 22);

        map.put(firstEmp, firstEmp.toString());
        map.put(secondEmp, secondEmp.toString());

        System.out.println(map.get(firstEmp));
        System.out.println(map.get(secondEmp));

        firstEmp.setName("Hulio");

        System.out.println(map.get(firstEmp)/*.toUpperCase()*/); // NPE!!!
        System.out.println(map.get(secondEmp));

        firstEmp.setName("Ivan");

        System.out.println(map.get(firstEmp));
        System.out.println(map.get(secondEmp));
    }

    static class Employee {

        private String name;
        private int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Employee employee = (Employee) o;

            if (age != employee.age) return false;
            return name != null ? name.equals(employee.name) : employee.name == null;

        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + age;
            return result;
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
