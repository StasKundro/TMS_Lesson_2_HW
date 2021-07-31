package com.company;

public class les1n4 {
    public static void main(String[] args) {
        int[] num = {1, -3, -7, 10};

        int Negative = 0;
        int Positive = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                Positive++;
            }
        }
        System.out.println("Положительных: " + Positive);


    }

}
