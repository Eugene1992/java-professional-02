package com.cbs.edu.io.adapter;

public class WildTurkey implements ITurkey {

    @Override
    public void gobble() {
        System.out.println("Gobble");
    }

    @Override
    public void fly() {
        System.out.println("Fly in a short distance!");
    }
}
