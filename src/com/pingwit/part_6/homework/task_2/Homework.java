package com.pingwit.part_6.homework.task_2;

public class Homework {
    public static void main(String[] args) {
        // заданний массив чисел
        int[] numbers = {10, 20, 30, 40, 50};

        // находим сумму всех элементов массива
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Находим среднее арифметическое
        double average = (double) sum / numbers.length;

        // выводим результат на экран
        System.out.println("среднее арифмитическое чисел в массиве: " + average);

    }
}
