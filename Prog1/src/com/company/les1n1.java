package com.company;

public class les1n1 {
    public static void main(String[] args) {
        int n = 1236;
        int a = 0;
        for ( ; n != 0 ; n /= 10)
            ++a;
        System.out.println(a);

    }
}
