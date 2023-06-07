package ru.netology.services;

public class VacantionsService {
    public int calculate(int income, int expenses, int threshold) {
        int amount = 0;
        int relaxMonth = 0;
        for (int i = 0; i < 12; i++) {
            if (amount >= threshold) {
                //отпуск
                amount = amount - expenses;
                amount = amount / 3;
                relaxMonth++;
            } else {
                //работа
                amount = amount + income;
                amount = amount - expenses;

            }

        }
        return relaxMonth;

    }
}