package com.cbs.edu.sets;

import java.util.*;

public class RemoveDupl {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(0);
        integers.add(1);
        integers.add(1);
        integers.add(0);
        integers.add(2);
        integers.add(0);
        integers.add(0);
        integers.add(2);
        integers.add(2);

        System.out.println(integers);

        integers = new ArrayList<>(new HashSet<>(integers));

        System.out.println(integers);
    }
}
