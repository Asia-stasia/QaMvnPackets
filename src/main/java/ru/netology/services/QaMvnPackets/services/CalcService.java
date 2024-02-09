package ru.netology.services.QaMvnPackets.services;
public class CalcService {
    public int calculate(int income, int expenses, int threshold) {
        int vacationMonths = 0; // счётчик месяцев отдыха
        int savings = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (savings > threshold) { // можем ли отдыхать?
                vacationMonths++; // увеличиваем счётчик месяцев отдыха
                savings = savings - expenses;
                savings = savings - expenses * 3;
            } else {
                savings = (savings + income - expenses);
            }
        }
        return vacationMonths;
    }
}
