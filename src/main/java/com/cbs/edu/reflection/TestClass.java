package com.cbs.edu.reflection;

import java.io.Serializable;

public class TestClass extends Object implements Serializable, Cloneable{

    public String someStringField;
    private int someIntField;
    Object someObjectField;
    protected boolean someBooleanField;
    private static int someStaticField;

    public TestClass() {
    }

    public TestClass(String someStringField, Object someObjectField, boolean someBooleanField) {
        this.someStringField = someStringField;
        this.someObjectField = someObjectField;
        this.someBooleanField = someBooleanField;
    }

    private void somePublicMethod() {

    }

    private void somePrivateMethod() {

    }

    static void someStaticMethod() {

    }
}
