package com.pingwit.part_6;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 100;
        }

        for (Integer integer : array) {
            System.out.println(integer);
        }

        Integer[] initArray = {9, 8, 7, 6, 5,};
        for (Integer integer : initArray) {
            System.out.println(integer);
        }

        // System.out.println(initArray[100]);


        System.out.println(Arrays.toString(initArray));

        initArray = new Integer[]{0, 1};
        initArray[0] = 33;
    }
}
