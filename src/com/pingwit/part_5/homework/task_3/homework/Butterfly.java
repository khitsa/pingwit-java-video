package com.pingwit.part_5.homework.task_3.homework;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер бабочки: "); // после : пробел не нужен
        int size = scanner.nextInt();

        drawButterfly(size);
    }

    /*
    Я ввел размер бабочки 9 и получил вот такой результат:
    1       1
    12     21
    123   321
    1234 4321
    1234 4321
    123   321
    12     21
    1       1

    Между четверками есть пробел, значит, где-то есть недоработка. Пробела быть не должно, попробуй использовать Debug
     */
    public static void drawButterfly(int size) {
        int halfSize = size / 2;

        // у тебя цикл, внутри которого еще 3 цикла. Попробуй пока переписать код так, чтобы внутри был только один цикл
        for (int i = 1; i <= halfSize; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 2 * (halfSize - i) + 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        // у тебя цикл, внутри которого еще 3 цикла. Попробуй пока переписать код так, чтобы внутри был только один цикл
        for (int i = halfSize; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 2 * (halfSize - i) + 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}









