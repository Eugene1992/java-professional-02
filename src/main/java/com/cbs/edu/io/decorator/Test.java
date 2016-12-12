package com.cbs.edu.io.decorator;

public class Test {
    public static void main(String[] args) {
        Writable stringWriter = new StringWriter();

        stringWriter.write("Hello world!");

        QuoteDecorator quoteDecorator = new QuoteDecorator(stringWriter);
        quoteDecorator.write("Hello world!");

        BracketDecorator bracketDecorator = new BracketDecorator(new QuoteDecorator(stringWriter));
        bracketDecorator.write("Hello world!");
    }
}
