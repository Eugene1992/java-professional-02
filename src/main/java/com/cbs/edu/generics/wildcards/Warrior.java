package com.cbs.edu.generics.wildcards;

public class Warrior extends GameUnit {

    protected String name;
    protected int power;

    public Warrior(String name, int power, int health) {
        super(health);
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
}
