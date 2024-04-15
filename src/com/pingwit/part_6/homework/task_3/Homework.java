package com.pingwit.part_6.homework.task_3;

public class Homework {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // проходим по каждому элемента массива
        for (int i = 0; i < array.length; i++) {
            // если элемент нечетный, заменяем его на 0
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }

        // выводим измененный массив
        System.out.println("Измененный массив:");
        for (int num : array) {
            System.out.print(num + ""); // А зачем ты добавляешь ""?
        }
    }
}
