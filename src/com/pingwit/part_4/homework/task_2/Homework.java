package com.pingwit.part_4.homework.task_2;

public class Homework {
    public static void main(String[] args) {
        int hours = 24;
        int amoeba = 1;
        int time = 3;

        while (time <= hours) {
            amoeba *= 2;
            System.out.println("Через " + time + " часов будет " + amoeba + "амеб(ы)."); // "амеб(ы)." -> добавь пробел после первой "
            time += 3;
        }
    }
}
