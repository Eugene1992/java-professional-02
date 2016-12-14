package com.cbs.edu.reflection;

public class Methods {
    public static void main(String[] args) {
        Class<TestClass> clazz = TestClass.class;

        String name = clazz.getName();
        String typeName = clazz.getTypeName();
        String simpleName = clazz.getSimpleName();
        String canonicalName = clazz.getCanonicalName();

        System.out.println("Name: \t\t\t" + name);
        System.out.println("TypeName: \t\t" + typeName);
        System.out.println("SimpleName: \t" + simpleName);
        System.out.println("CanonicalName: \t" + canonicalName);

        String s = clazz.toGenericString();
        System.out.println(s);
    }
}
