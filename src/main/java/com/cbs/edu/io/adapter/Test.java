package com.cbs.edu.io.adapter;

public class Test {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        clientRequest(mallardDuck);

        WildTurkey wildTurkey = new WildTurkey();
        IDuck adapter = new TurkeyAdapter(wildTurkey);

        clientRequest(adapter);
    }

    static void clientRequest(IDuck duck) {
        duck.quack();
        duck.fly();
    }
}
