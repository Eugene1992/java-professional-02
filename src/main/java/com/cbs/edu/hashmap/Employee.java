package com.cbs.edu.hashmap;

public class Employee {

    private String name;
    private int age;
    private boolean isMarried;

    public Employee(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (isMarried != employee.isMarried) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (isMarried ? 1 : 0);
        return result;
    }
}
