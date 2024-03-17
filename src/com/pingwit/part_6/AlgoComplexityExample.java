package com.pingwit.part_6;

import java.util.Arrays;

public class AlgoComplexityExample {
    public static void main(String[] args) {
        /*
        Для начала давайте разберемся что же такое сложность алгоритма - это то количественная характеристика, которая говорит о том,
        сколько времени, либо какой объём памяти потребуется для выполнения алгоритма.

        Развитие технологий привело к тому, что память перестала быть критическим ресурсом.
        Поэтому когда говорят об анализе сложности алгоритма, обычно подразумевают то, насколько быстро он работает.

        Но ведь время выполнения алгоритма зависит от того, на каком устройстве его запустить.
        Один и тот же алгорити запущенный на разных устройствах выполняется разное время.

        Тогда было предложено измерять сложность алгоритмов в элементарных шагах - то, сколько действий необходимо совершить для его выполнения.
        Любой алгорити включает в себя определённое количество шагов и не важно на каком устройстве он будет запущен,
        количество шагов останется неизменным.
        Эту идею принято представлять в виде Big O (или O-нотации).

        Big O показывает то, как сложность алгоритма растёт с увеличением входных данных.
        При этом она всегда показывает худший вариант развития событий - верхнюю границу.
         */

        int[] numbers = {11, 22, 33, 44, 55};
        /*
        Популярные сложности алгоритмов:
        1. Константная (1)
        Означает, что вычислительная сложность алгоритма не зависит от входных данных.
        Однако, это не значит, что алгоритм выполняется за одну операцию или требует очень мало времени.
        Это означает, что время не зависит от входных данных.

        Мы с вами уже познакомились с массивами. Так вот получение элемента массива по индексу происходит за 0(1).
        т.е. абсолютно не зависит от размера массива.
        Это обусловлено тем, что ячейки массива в памяти расположены последовательно, а, значит, зная где находится массив в памяти
        мы точно можем сказать где лежит элемент с индексом 10, 15 и т.д.
         */
        int lastNumber = numbers[numbers.length];
        /*
        2. Линейная O(n).
        Означает, что сложность алгоритма линейно растёт с увеличением входных данных.
        Другими словами, удвоение размера входных данных удвоит и необходимое время для выполнения алгоритма, поиск нужного элемента тоже происходит за O(n).

        Например, вывести массив на экран это O(n), поиск нужного элемента тоже происходит за О(n).
        Даже, если нужный нам элемент будет первым и получается, что мы супер быстро его нашли, сложность нашего алгоритма все равно
        будет O(n), т.к. рассматривается именно худший случай, если бы нужное число лежало в конце массива.
         */
        System.out.println(Arrays.toString(numbers));

        /*
        3. Логарифмический O(log n).
        Означает, что сложность алгоритма растёт логарифмически с увеличением входных данных.
        Время выполнения O(log n) быстрее O(п), а с увеличением размера списка, в котором ищется значение, оно становится намного быстрее
         */

        /*
        4. Квадратичная 0(n2), O(n^2).
        Означает, что удвоение размера входных данных увеличивает время выполнения в 4 раза.
        Например, при увеличении данных в 10 раз, количество операций (и время выполнения) увеличится примерно в 100 раз.
        Если алгоритм имеет квадратичную сложность, то это повод пересмотреть необходимость использования данного алгоритма.
        Но иногда этого не избежать.

        Такие алгоритмы легко узнать по вложенным циклам.
        Например, распечатать двумерный массив это O(n2), а трехмерный уже O(n3), т.е. степень n это количество циклов
         */

        int[][] table = {
                {11, 22, 33, 44, 55},
                {66, 77, 88, 99, 100}
        };

        for (int[] row : table) {
            System.out.println(Arrays.toString(row));
        }
    }
}
