package com.pingwit.part_7.homework;

public class CarlnsuranceCalculator {
    public static void main(String[] args) {
        // Расчет стоимости страховки и вывод результатов
        double insuranceCost = calculateInsuranceCost(1600, true, true);
        System.out.println("Стоимость страховки: " + insuranceCost + " евро");
    }

    public static double calculateInsuranceCost(int engineVolume, boolean hasAccident, boolean isRegularCustomer) {
        // Расчет базовой стоимости страховки
        double baseCost = engineVolume * 0.25;

        // Применение скидки для постоянных клиентов
        if (isRegularCustomer) {
            baseCost *= 0.8; // Коэффициент скидки 0.8
        }

        // Применение надбавки за ДТП
        if (hasAccident) {
            baseCost *= 1.2; // Коэффициент надбавки 1.2
        }

        return baseCost;
    }
}

