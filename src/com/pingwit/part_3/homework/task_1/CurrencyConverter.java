package com.pingwit.part_3.homework.task_1;

public class CurrencyConverter {
    public static void main(String[] args) {
            int amountInDollars = 100;
            int currencyId = 2; // Например, 1 - евро, 2 - гривны

            double exchangeRate;

            switch (currencyId) {
                case 1:
                    exchangeRate = 0.85;
                    System.out.println("Сумма в евро: " + (amountInDollars * exchangeRate));
                    break;
                case 2:
                    exchangeRate = 73.0; // курс доллара к гривне
                    System.out.println("Сумма в гривнах: " + (amountInDollars * exchangeRate));
                    break;
                default:
                    System.out.println("Ваш банк не может обменять на данную валюту");
            }
        }
    }


