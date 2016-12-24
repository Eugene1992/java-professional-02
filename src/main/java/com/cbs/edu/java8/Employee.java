package com.cbs.edu.java8;

public class Employee {
    private String name;
    private int age;
    private int salary;
    private Gender gender;

    public Employee(String name, int age, int salary, Gender gender) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Gender getGender() {
        return gender;
    }

    enum Gender {
        MALE, FEMALE
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
