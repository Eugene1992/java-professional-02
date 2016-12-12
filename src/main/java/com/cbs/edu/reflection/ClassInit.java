package com.cbs.edu.reflection;

public class ClassInit {
    public static void main(String[] args) {

        TestClass myClass = new TestClass();
        Class<? extends TestClass> aClass = myClass.getClass();

        Class<TestClass> myClassClass = TestClass.class;

        try {
            Class<?> loadedClass = Class.forName("com.cbs.edu.reflection.TestClass");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Classloader not found expected class..");
        }
    }
}
