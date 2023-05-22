package ru.netology.services;

public class workService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;

        int num = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money = (money - expenses) / 3;
                num = num + 1;
            } else {
                money = (money + income) - expenses;
            }
        }
        return num;
    }
}
