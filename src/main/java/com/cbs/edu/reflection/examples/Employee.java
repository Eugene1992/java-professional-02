package com.cbs.edu.reflection.examples;

import com.cbs.edu.reflection.json_conv.JsonEntity;
import com.cbs.edu.reflection.json_conv.JsonField;

import java.io.Serializable;
import java.util.RandomAccess;

@JsonEntity
public class Employee extends Parent implements Cloneable, Serializable, RandomAccess {

    @JsonField
    public int p = 10;

    @JsonField
    private String firstName;

    @JsonField
    private String lastName;
    
    private int age;

    @JsonField
    private int salary;

    public Employee(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (salary != employee.salary) return false;
        if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
        return lastName != null ? lastName.equals(employee.lastName) : employee.lastName == null;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + salary;
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "p=" + p +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    private void say() {
        System.out.println("Hello!");
    }
}
