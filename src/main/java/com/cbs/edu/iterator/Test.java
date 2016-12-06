package com.cbs.edu.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");

        for (String string : strings) {
//            if (string.equals("2")) strings.remove("2");
            System.out.println(string);
        }

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("2")) {
                iterator.remove();
                continue;
            }
            System.out.println(next);
        }
    }
}
