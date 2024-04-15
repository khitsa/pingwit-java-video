package com.pingwit.part_6.homework.task_4;

// у тебя пока не совсем таблица получилась
public class Homework {
    public static void main(String[] args) {
        // создаем двумерный массив для хранения таблицы умножения
        int[][] multiplicationTable = new int[10][10];

        // заполняем таблицу умножения
        for (int i = 0; i < 10; i++) { // i < 10 -> multiplicationTable.length
             //int[] row = multiplicationTable[i];
            for (int j = 0; j < 10; j++) { // j < 10 -> row.length
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        // выводим таблицу умножения на экран
        System.out.println("Таблица умножения:");
        for (int i = 0; i < 10; i++) { //i < 10 -> multiplicationTable.length
            ////int[] row = multiplicationTable[i];
            for (int j = 0; j < 10; j++) { // // j < 10 -> row.length
                System.out.println(multiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
