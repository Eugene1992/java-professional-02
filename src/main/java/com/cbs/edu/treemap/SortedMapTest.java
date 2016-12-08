package com.cbs.edu.treemap;

import java.util.*;

public class SortedMapTest {
    public static void main(String[] args) {
        SortedMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < 20; i++) {
            map.put(i, 100);
        }

        Integer firstKey = map.firstKey();
        Integer lastKey = map.lastKey();

        Comparator<? super Integer> comparator = map.comparator();

        System.out.printf("%d ... %d\n\n", firstKey, lastKey);

        Set<Integer> integers = map.keySet();
        System.out.println(integers + "\n");

        Collection<Integer> values = map.values();
        System.out.println(values + "\n");

        SortedMap<Integer, Integer> headMap = map.headMap(10);
        System.out.println(headMap + "\n");

        SortedMap<Integer, Integer> tailMap = map.tailMap(10);
        System.out.println(tailMap + "\n");

        SortedMap<Integer, Integer> subMap = map.subMap(5, 15);
        System.out.println(subMap + "\n");

    }
}
