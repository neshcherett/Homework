package com.tneshcheret;


public class Task1 {

    public static void main(String[] args) {
        // Задание 1) банк положили S денег. Какой станет сумма вклада через N лет, если процент 1,5% добавляется к сумме вклада ежемесячно.
        double deposit = 1000;
        double monthlyInterestRate = 0.015;
        int depositPeriodYears = 1;

        for (int i = 1; i <= depositPeriodYears * 12; i++) {
            deposit = deposit * (1 + monthlyInterestRate);
            deposit = Math.round(deposit * 100) / 100.0;
        }

        System.out.println("Сумма вклада через " + depositPeriodYears + " г. " + "составит " + deposit);
    }
}
