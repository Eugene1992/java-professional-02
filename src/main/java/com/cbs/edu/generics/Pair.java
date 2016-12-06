package com.cbs.edu.generics;

public class Pair {
    private Object key;
    private Object value;

    public Pair(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair pairOne = new Pair(10, "String");
        Pair pairTwo = new Pair("String", 10);

        String key = (String) pairOne.getKey(); // ClassCastException!
    }
}
