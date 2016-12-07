package com.cbs.edu.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> integers = new LinkedList<>();

        integers.add("0"); // 0
        integers.add("1"); // 1
        integers.add("2"); // 2
        integers.add(1, "1*");

        System.out.println(integers);

        integers.set(0, "Zero");

        System.out.println(integers);

        integers.add("1");
        integers.add("1");

        System.out.println(integers);

        integers.remove("1");

        System.out.println(integers);

        integers.remove(0);

        System.out.println(integers);

        System.out.println(integers.size());

        System.out.println(integers.indexOf("2"));
        System.out.println(integers.indexOf("!!!"));

        System.out.println(integers.contains("!!!"));

    }
}
