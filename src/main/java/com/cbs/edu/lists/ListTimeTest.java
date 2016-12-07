package com.cbs.edu.lists;

import java.util.List;

public class ListTimeTest<T> {

    private List<T> list;

    public ListTimeTest(List<T> list) {
        this.list = list;
    }

    public long testAdd(T elem, int count, OperationType operation) {
        long start = System.currentTimeMillis();
        if (operation == OperationType.START) {
            for (int i = 0; i < count; i++) {
                list.add(0, elem);
            }
        }
        if (operation == OperationType.MIDDLE) {
            for (int i = 0; i < count; i++) {
                list.add(list.size() / 2, elem);
            }
        }
        if (operation == OperationType.END) {
            for (int i = 0; i < count; i++) {
                list.add(elem);
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    enum OperationType {
        START, MIDDLE, END
    }
}
