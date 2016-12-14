package com.cbs.edu.serialization.sample;

import java.io.*;

/**
 * Иногда бывает нужно управлять процессом сериализации. Вот одни из причин:

 1) Объект не готов к сериализации: его нынешнее внутреннее состояние в процессе изменения.

 2) Объект содержит несериализуемые объекты, но может перевести их в удобную для сериализации форму:
    сохранить в массив байт или что-нибудь еще.

 3) Объект хочет десериализовать все свои данные, как одно целое и/или зашифровать их перед сериализацией.
 */
public class Employee implements Serializable {

    private String firstName;

    private String lastName;

    public int age;

    private int salary;

    private static final long serialVersionUID = 42L;

    public Employee(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
