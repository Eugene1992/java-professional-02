package com.cbs.edu.treemap;

import java.util.*;

public class NavigableMapTest {
    public static void main(String[] args) {
        NavigableMap<Integer, Integer> map = new TreeMap<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            map.put(random.nextInt(10), 100);
        }

        System.out.println(map + "\n");

        Map.Entry<Integer, Integer> lowerEntry = map.lowerEntry(7);
        Integer lowerKey = map.lowerKey(7);

        Map.Entry<Integer, Integer> higherEntry = map.higherEntry(7);
        Integer higherKey = map.higherKey(7);

        System.out.println("LowerEntry key:" + lowerEntry.getKey() + "\n");
        System.out.println("HigherEntry key:" + higherEntry.getKey() + "\n");

        Map.Entry<Integer, Integer> ceilingEntry = map.ceilingEntry(7);
        System.out.println("CeilingEntry key:" + ceilingEntry.getKey() + "\n");

        Map.Entry<Integer, Integer> floorEntry = map.floorEntry(7);
        System.out.println("FloorEntry key:" + floorEntry.getKey() + "\n");

        NavigableMap<Integer, Integer> headMap = map.headMap(7, true);
        System.out.println(headMap + "\n");

        NavigableMap<Integer, Integer> tailMap = map.tailMap(7, true);
        System.out.println(tailMap + "\n");

        NavigableMap<Integer, Integer> subMap = map.subMap(2, true, 5, true);
        System.out.println(subMap + "\n");

        NavigableSet<Integer> descIntegers = map.descendingKeySet();
        System.out.println(descIntegers);

        NavigableSet<Integer> navIntegers = map.navigableKeySet();
        System.out.println(navIntegers);


    }
}
