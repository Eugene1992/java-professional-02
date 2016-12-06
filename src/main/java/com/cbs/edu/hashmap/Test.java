package com.cbs.edu.hashmap;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put(null, "One");
        map.put("1", "Two");
        map.put("2", "Twooo");
        map.put("3", "Three");
        map.put("4", "Four");


        boolean sd = map.containsKey("sd");
//        System.out.println(sd);

        /*Set<Map.Entry<String, String>> entries = map.entrySet();

        Iterator<Map.Entry<String, String>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();

            System.out.println(next.getKey() + " - " + next.getValue());
        }*/

        String s1 = map.get("5");
        String s2 = map.getOrDefault("5", "Five");

        System.out.println(s2.toUpperCase());

        Set<String> strings = map.keySet();
        Collection<String> values = map.values();

        System.out.println(map.size());

        map.remove("2");
    }
}
