package com.cbs.edu.generics;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<? super B> objects = new ArrayList<>();

//        objects.add(new A());
        objects.add(new B());
        objects.add(new C());

    }

    static class A {
    }

    static class B extends A {
    }

    static class C extends B {
    }
}
