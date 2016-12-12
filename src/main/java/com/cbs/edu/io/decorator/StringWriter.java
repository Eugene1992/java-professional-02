package com.cbs.edu.io.decorator;

public class StringWriter implements Writable {

    @Override
    public void write(String str) {
        System.out.println(str);
    }
}
