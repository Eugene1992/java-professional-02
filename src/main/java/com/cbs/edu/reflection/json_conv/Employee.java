package com.cbs.edu.reflection.json_conv;

@JsonEntity
public class Employee {

    @JsonField
    private String firstName;

    @JsonField
    private String lastName;

    @JsonField
    public int age;

    @JsonField(name = "pay")
    private int salary;

    public Employee(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
}
