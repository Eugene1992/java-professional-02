package com.cbs.edu.link_hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
//        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map = new LinkedHashMap<>();
        /*Map<Integer,Integer> map = new LinkedHashMap<Integer, Integer>(){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer,Integer> map){
                return size() > 3;
            }
        };*/

        for (int i = 0; i < 100; i += 10) {
            map.put(i, i);
        }

        System.out.println(map);


    }
}
