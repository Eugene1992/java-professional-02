package com.cbs.edu.io.decorator;

public class QuoteDecorator implements Writable {

    private Writable writable;

    public QuoteDecorator(Writable writable) {
        this.writable = writable;
    }

    @Override
    public void write(String str) {
        writable.write(String.format("%s%s%s", "\'", str, "\'" ));
    }
}
