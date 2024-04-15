package com.pingwit.part_6.homework.task_8;

// очень хорошо
public class Homework {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        int maxLength = 0;
        int maxElement = 0; // maxElement исходя из этого названия переменной там должно быть максимальное число внутри массива, а переменная содержит индекс, с которого начинается последовательность, переименуй
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxElement = i - maxLength;
                }
                currentLength = 1;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxElement = arr.length - maxLength;
        }

        System.out.println("Количество элементов самой длинной последовательности: " + maxLength);
        System.out.println("начало самой длинной последовательности: " + maxElement);
// лишняя строка, удали
    }
}
