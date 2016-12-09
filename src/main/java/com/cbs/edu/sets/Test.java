package com.cbs.edu.sets;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
        }

        System.out.println(integers);


        System.out.println(integers);
    }
}
