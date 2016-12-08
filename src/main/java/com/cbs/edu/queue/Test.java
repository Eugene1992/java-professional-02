package com.cbs.edu.queue;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> integers = new PriorityQueue<>(10);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            integers.offer(random.nextInt(10));
        }

        System.out.println(integers);

        Deque<Integer> linkedQueue = new LinkedList<>();

        ArrayDeque arrayDeque = new ArrayDeque();
    }
}
