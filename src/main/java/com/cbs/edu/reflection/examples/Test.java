package com.cbs.edu.reflection.examples;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Employee employee = new Employee("Evgeniy", "Deyneka", 23, 15000);

        Class<? extends Employee> aClass = employee.getClass();

        Class<Employee> employeeClass = Employee.class;

        Class<?> aClass1 = Class.forName("com.cbs.edu.reflection.examples.A");
        A a = (A) aClass1.newInstance();

        String name = aClass.getName();
        String simpleName = aClass.getSimpleName();
        String typeName = aClass.getTypeName();
        String canonicalName = aClass.getCanonicalName();
        System.out.println(name);
        System.out.println(simpleName);
        System.out.println(typeName);
        System.out.println(canonicalName);

        Class<?> superclass = aClass.getSuperclass();
        String name1 = superclass.getName();
        System.out.println(name1);

        aClass.asSubclass(superclass);

        AnnotatedType annotatedSuperclass = aClass.getAnnotatedSuperclass();

        Annotation[] annotations = aClass.getAnnotations();

        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        AnnotatedType[] annotatedInterfaces = aClass.getAnnotatedInterfaces();
        for (AnnotatedType annotatedInterface : annotatedInterfaces) {
            System.out.println(annotatedInterface.getType().getTypeName());
        }

        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            Annotation[] annotations1 = field.getAnnotations();
            for (Annotation annotation : annotations1) {
                System.out.println(annotation);
            }
            System.out.println(field.get(employee));
        }

        Field privateField = aClass.getDeclaredField("firstName");
        privateField.setAccessible(true);
        System.out.println(privateField.get(employee));

        System.out.println(employee);
        privateField.set(employee, "Ivan");
        System.out.println(employee);

        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getParameterCount());
        }

        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Method say = aClass.getDeclaredMethod("say", null);
        say.setAccessible(true);
        say.invoke(employee, null);

        int modifiers = say.getModifiers();
        System.out.println(Modifier.isPrivate(modifiers));
        System.out.println(Modifier.isPublic(modifiers));

        Employee employee1 = aClass.newInstance();

    }
}
