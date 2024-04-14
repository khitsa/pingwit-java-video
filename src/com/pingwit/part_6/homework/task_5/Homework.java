package com.pingwit.part_6.homework.task_5;

public class Homework {
    public static void main(String[] args) {
        // исходный массив
        int[] array = {0, 1, 2, 3, 4};

        // создаем временный массив для хранения инвертированных элементов
        int[] reversedArray = new int[array.length];

        // заполняем временный массив инвертированный массив на экран
        System.out.println("Инвертированный массив:");
        for (int num : reversedArray) {
            System.out.println(num + "");
        }
    }
}
