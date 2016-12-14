package com.cbs.edu.reflection.json_conv;

public class Test {
    public static void main(String[] args) throws IllegalConvertTypeException, IllegalAccessException {
        Employee employee = new Employee("Evgeniy", "Deyneka", 23, 15000);

        String str = JsonConverter.convertToJson(employee);

        System.out.println(str);

        String s = "Hello world";
    }
}
