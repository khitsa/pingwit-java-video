package com.pingwit.part_5.homework.task_3.homework;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите размер бабочки: ");
                int size = scanner.nextInt();

                drawButterfly(size);
            }

            public static void drawButterfly(int size) {
                int halfSize = size / 2;

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









