package com.pingwit.part_2.homework.task_5;

public class Homework {
    public static void main(String[] args) {
        int dividend = 10;// для остатка от деления нужен оператор %
        int divisor = 3;

        // Вычеслям остаток от деления
        int remainder = dividend % divisor;

        // Выводим остаток на экран
        System.out.println(" Остаток от деления " + dividend + " на " + dividend + " равен " + remainder); // у тебя здесь скорее всего опечатка, т.к. dividend дублируется два раза
    }
}
