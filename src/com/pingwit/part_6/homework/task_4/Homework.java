package com.pingwit.part_6.homework.task_4;

public class Homework {
    public static void main(String[] args) {
        // создаем двумерный массив для хранения таблицы умножения
        int[][] multiplicationTable = new int[10][10];

        // заполняем таблицу умножения
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        // выводим таблицу умножения на экран
        System.out.println("Таблица умножения:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(multiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
