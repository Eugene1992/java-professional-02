package com.cbs.edu.io.adapter;

public class MallardDuck implements IDuck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
