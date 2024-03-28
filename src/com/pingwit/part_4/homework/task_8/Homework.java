package com.pingwit.part_4.homework.task_8;

public class Homework {
    public static void main(String[] args) {
        int sumEven = 0; // переменная для хранения суммы четных чисел
        int sumOdd = 0; // переменная для хранения суммы нечетных чисел
        int sumTotal = 0; // переменная для хранения общей суммы всех чисел
        int number = 0; // начальное значение числа

        // Используем цикл while для перебора чисел от 0 до 100
        while (number <= 100) {
            sumTotal += number; // добавляем текущее число к общей сумме

            if (number % 2 == 0) {
                // Если число четное, добавляем его к сумме четных чисел
                sumEven += number;
            } else {
                // Если число нечетное, добавляем его к сумме нечетных чисел
                sumOdd += number;
            }
            number++; // увеличиваем число на 1
        }

        // Выводим сумму четных чисел
        System.out.println("Сумма четных чисел: " + sumEven);

        // Выводим сумму нечетных чисел
        System.out.println("Сумма нечетных чисел: " + sumOdd);

        // Выводим общую сумму всех чисел
        System.out.println("Общая сумма всех чисел: " + sumTotal);
    }
}

