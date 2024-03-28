package com.pingwit.part_4.homework.task_6;

public class Homework {
    public static void main(String[] args) {
        int number = 2; // начальное значение числа

        // Используем цикл while для перебора чисел от 2 до 100
        while (number <= 100) {
            // Проверяем, является ли текущее число четным
            if (number % 2 == 0) {
                // Если число четное, выводим его
                System.out.println(number);
            }
            number++; // увеличиваем число на 1
        }
    }
}

