package com.cbs.edu.interfaces;

public interface I {
    void f();

    default void g(){
    }

    static void s(){
    }
}

