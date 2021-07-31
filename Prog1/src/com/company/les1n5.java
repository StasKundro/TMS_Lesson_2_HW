package com.company;

public class les1n5 {
    public static void main(String[] args) {
        int[] num = {2, -10, 8};

        int Negative = 0;
        int Positive = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                Negative++;
            } else if (num[i] > 0) {
                Positive++;
            }
        }
        System.out.println("Положительных: " + Positive);
        System.out.println("Отрицательных: " + Negative);
    }
}
