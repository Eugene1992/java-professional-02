package com.cbs.edu.treemap;

import java.lang.ref.WeakReference;
import java.util.*;

public class SampleMapTest {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(10);
            map.put(num, i);
        }

        System.out.println(map);

        WeakHashMap<Object, Object> weakHashMap = new WeakHashMap<>();
        WeakReference<Integer> i = new WeakReference<>(4);
    }
}
