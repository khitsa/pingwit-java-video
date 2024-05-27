package com.pingwit.part_9.homework.task_1;

import java.util.Arrays;

public class Warehouse {
    private final int[] array;
    private int currentIndex = 0;

    // Конструктор класса Warehouse
    public Warehouse(int[] inputArray) {
        // Создаем копию входного массива, чтобы сделать его immutable
        this.array = Arrays.copyOf(inputArray, inputArray.length);
    }

    // Метод для получения следующего элемента массива
    public int next() {
        int element = array[currentIndex];
        currentIndex = (currentIndex + 1) % array.length; // Сбрасываем индекс при достижении конца массива
        return element;
    }

    // Метод для получения копии массива
    public int[] getArray() {
        return Arrays.copyOf(array, array.length); // Возвращаем копию массива
    }

    // Переопределение метода toString() для вывода содержимого массива
    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        Warehouse warehouse = new Warehouse(data);

        System.out.println(warehouse);
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());

        int[] arrayCopy = warehouse.getArray(); // Получаем копию массива
        System.out.println(Arrays.toString(arrayCopy)); // Выводим копию массива
    }
}



