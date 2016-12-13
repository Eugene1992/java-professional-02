package com.cbs.edu.annotations;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", "Ivanov");

        Class<? extends Employee> aClass = ivan.getClass();

        if (aClass.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = aClass.getAnnotation(MyAnnotation.class);

            System.out.println(annotation.value());
            System.out.println(annotation.num());
        }

        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.isAnnotationPresent(MyFieldAnnotation.class)) {
                MyFieldAnnotation annotation = declaredField.getAnnotation(MyFieldAnnotation.class);
                System.out.println(annotation.title());
                System.out.println(declaredField.getName());
            }
        }
    }

    @MyAnnotation(value = "Hello world", num = 666)
    static class Employee {

        @MyFieldAnnotation
        private String name;

        @MyFieldAnnotation(title = "MyTittle")
        private String lastname;

        public Employee(String name, String lastname) {
            this.name = name;
            this.lastname = lastname;
        }
    }
}
