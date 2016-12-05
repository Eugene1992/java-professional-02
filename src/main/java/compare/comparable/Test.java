package compare.comparable;

import java.util.*;

// Comparable - natural ordering
public class Test {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>(Arrays.asList(
                new Employee("Ivan", 28),
                new Employee("Gleb1", 25),
                new Employee("Gleb2", 25),
                new Employee("Maksim", 35)
        ));

        System.out.println(employees);
        Collections.sort(new ArrayList<>(employees));
        System.out.println(employees);
    }

    private static class Employee implements Comparable<Employee> {
        String name;
        int age;

        public Employee(String name, int age) {
            this.name = name;
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

        @Override
        public int compareTo(Employee emp) {
//            if (this.age > emp.age) return 1;
//            if (this.age < emp.age) return -1;
//            return 0;
            return this.age - emp.age;
        }
    }
}
