package com.cbs.edu.compare.comparator;

import java.util.Comparator;

public class EmployeeByNameComparator implements Comparator<Test.Employee>{

    @Override
    public int compare(Test.Employee o1, Test.Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
