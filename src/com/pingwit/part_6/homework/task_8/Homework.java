package com.pingwit.part_6.homework.task_8;

public class Homework {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        int maxLength = 0;
        int maxElement = 0;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxElement = i - maxLength;
                }
                currentLength = 1;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxElement = arr.length - maxLength;
        }

        System.out.println("Количество элементов самой длинной последовательности: " + maxLength);
        System.out.println("начало самой длинной последовательности: " + maxElement);

    }
}
