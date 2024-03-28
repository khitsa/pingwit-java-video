package com.pingwit.part_4.homework.task_1;

public class Homework {
    public static void main(String[] args) {
        double distance = 10; // начальное расстояние в км
        double totalDistance = 0; // суммарное растояние
        int day = 1; // счетчик дней
        while (day <= 7) {
            totalDistance += distance; // добавляем растояние за текущий день к суммарному растоянию
            distance *= 1.1; // увеличиваем расстояник на 10% для след дня
            day++; // увеличиваем счетчик дней
        }
        System.out.println("Сумарный путь спортсмена за 7 дней: " + totalDistance + " км"); // Сумарный -> Суммарный
    }
}
