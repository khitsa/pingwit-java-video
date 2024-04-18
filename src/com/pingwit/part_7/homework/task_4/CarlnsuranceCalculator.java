package com.pingwit.part_7.homework.task_4;

// это Task 4, значит, нужен отдельный пакет task_4
public class CarlnsuranceCalculator { // если Idea что-то подчеркнула зеленым, скорее всего есть опечатка, поправь
    public static void main(String[] args) {
        // Расчет стоимости страховки и вывод результатов
        double insuranceCost = calculateInsuranceCost(1600, true, true); // используй класс Scanner, чтобы вводить данные с консоли
        System.out.println("Стоимость страховки: " + insuranceCost + " евро");
    }

    // я думаю этот метод можно сделать приватным
    public static double calculateInsuranceCost(int engineVolume, boolean hasAccident, boolean isRegularCustomer) {
        // Расчет базовой стоимости страховки
        double baseCost = engineVolume * 0.25; // 0.25 - это магическое число, т.е. я мне необходимо догадываться для чего оно, вынеси в отдельную переменную

        // Применение скидки для постоянных клиентов
        if (isRegularCustomer) {
            baseCost *= 0.8; // Коэффициент скидки 0.8 - лучше удали комментарий и вынеси 0.8 в отдельную переменную
        }

        // Применение надбавки за ДТП
        if (hasAccident) {
            baseCost *= 1.2; // Коэффициент надбавки 1.2 - лучше удали комментарий и вынеси 0.8 в отдельную переменную
        }

        return baseCost;
    }
}

