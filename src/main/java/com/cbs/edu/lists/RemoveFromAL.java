package com.cbs.edu.lists;

import java.util.ArrayList;
import java.util.List;

public class RemoveFromAL {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            al.add(i);
        }

        System.out.println(al);

        for (int i = 7; i < 12; i++) {
            al.remove(7);
        }

        for (int i = 12; i > 7; i--) {
            al.remove(i);
        }

        System.out.println(al);
    }
}
