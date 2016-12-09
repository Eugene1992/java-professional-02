package com.cbs.edu.coll_meth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        final ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Hello");
        strings.add("Hello");

        List<String> ulist = Collections.unmodifiableList(strings);
        ulist.add("hello");
    }
}
