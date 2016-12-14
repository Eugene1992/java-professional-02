package com.cbs.edu.strings;

public class ImTest {
    public static void main(String[] args) {
        String s = "Hello";

        s = s + " world!" + "!";

        StringBuilder stringBuilder = new StringBuilder(s);
        s = stringBuilder.append(" world!").append("!").toString(); // Builder pattern

        String substring = s.substring(0, 2);

        System.out.println(stringBuilder.reverse().toString());
    }
}
