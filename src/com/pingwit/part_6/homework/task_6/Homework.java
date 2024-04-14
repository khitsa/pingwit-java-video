package com.pingwit.part_6.homework.task_6;

public class Homework {
    public static void main(String[] args) {
        // исходный массив
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // определяем размер нового массива для четных элементов
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }

        // создаем новый массив для четных элементов
        int[] evenArray = new int[count];
        int index = 0;

        // заполняем новый массив четными элементами
        for (int num : array) {
            if (num % 2 == 0) {
                evenArray[index] = num;
                index++;
            }
        }

        // выводим новый массив на экран
        System.out.println("Массив четных элементов:");
        for (int num : evenArray) {
            System.out.println(num + "");
        }
    }
}
