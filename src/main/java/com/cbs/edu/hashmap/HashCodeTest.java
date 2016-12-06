package com.cbs.edu.hashmap;

import java.util.Arrays;

public class HashCodeTest {
    public static void main(String[] args) {
        Employee ivan1 = new Employee("Ivan", 30, true);
        Employee ivan2 = new Employee("Ivan", 30, true);
        Employee ivan3 = new Employee("Ivan", 30, true);

        System.out.println(ivan1.hashCode());
        System.out.println(ivan2.hashCode());
        System.out.println(ivan3.hashCode());

        String text = "My name is Evgeniy";

        String[] split = text.split(" ");

        System.out.println(Arrays.toString(split));
    }
}
