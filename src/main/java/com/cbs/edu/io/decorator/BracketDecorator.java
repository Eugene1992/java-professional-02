package com.cbs.edu.io.decorator;

public class BracketDecorator implements Writable {

    private Writable writable;

    public BracketDecorator(Writable writable) {
        this.writable = writable;
    }

    @Override
    public void write(String str) {
        writable.write(String.format("%s%s%s", "[", str, "]" ));
    }
}
