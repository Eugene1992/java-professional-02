package com.cbs.edu;

import java.util.Arrays;

/**
 * Some doc example.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {11, 2, 31, 4};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Method for summing two digits.
     * @param first first number
     * @param second second number
     * @return result sum
     */
    public static int sum(int first, int second) {
        return first + second;
    }
}
