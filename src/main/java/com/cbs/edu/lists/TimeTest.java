package com.cbs.edu.lists;

import java.util.ArrayList;
import java.util.List;

public class TimeTest {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            al.add(1000);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
