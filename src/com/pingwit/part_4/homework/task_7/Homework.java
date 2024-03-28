package com.pingwit.part_4.homework.task_7;

public class Homework {
    public static void main(String[] args) {
        int sum = 0; // переменная для хранения суммы нечетных чисел
        int number = 1; // начальное значение числа

        // Используем цикл while для перебора чисел от 1 до 99
        while (number <= 99) {
            // Проверяем, является ли текущее число нечетным
            if (number % 2 != 0) {
                // Если число нечетное, добавляем его к сумме
                sum += number;
            }
            number++; // увеличиваем число на 1
        }

        // Выводим сумму всех нечетных чисел от 1 до 99
        System.out.println("Сумма всех нечетных чисел от 1 до 99: " + sum);
    }
}


