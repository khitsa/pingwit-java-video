package com.pingwit.part_4.homework.task_4;

public class Homework {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int result = multiply(a, b);
        System.out.println(a + " * " + b + " = " + result);
    }

    public static int multiply(int a, int b) {//хорошее решение
        int result = 0;
        boolean isNegative = (a < 0 && b > 0) || (a > 0 && b < 0);

        a = Math.abs(a);
        b = Math.abs(b);

        while (b > 0) {
            result += a;
            b--;
        }

        return isNegative ? -result : result;
    }
}

