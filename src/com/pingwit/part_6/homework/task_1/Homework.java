package com.pingwit.part_6.homework.task_1;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // создаем массив из 3 элементов
        int[] numbers = new int[3];

        // создаем обьект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // заполняем массив значениями, введеными пользователем
        for (int i = 0; i < 3; i++) {
            System.out.println("введите число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // закрываем Scanner после использования,чтобы избежать утечек ресурсов
        scanner.close();

        // находим сумму, нвименьшее и наибольшее из чисел в массиве
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // выводим результат на экран
        System.out.println("сумма чисел: " + sum);
        System.out.println("Наименшее число: " + min);
        System.out.println("наибольшое число: " + max);
    }
}
