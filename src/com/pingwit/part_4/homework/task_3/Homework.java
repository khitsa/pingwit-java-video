package com.pingwit.part_4.homework.task_3;

public class Homework {
    public static void main(String[] args) {
        int sum = 0;
        int n = 9; // количество членов последовательности (от 1 до 256)
        int term = 1;

        for (int i = 0; i <= n; i++) {
            sum += term;
            term *= 2;
        }

        System.out.println("Сумма последовательности: " + sum);
    }
}
