package com.pingwit.part_4.homework.task_5;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Дюймы \t Сантиметры");
        System.out.println("------------------");

        final double CM_PER_INCH = 2.54;
        int inches = 1;

        do {
            double centimeters = inches * CM_PER_INCH;
            System.out.printf("%d \t %.2f\n", inches, centimeters);
            inches++;
        } while (inches <= 20);
    }

}
