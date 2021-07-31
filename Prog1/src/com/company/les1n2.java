package com.company;

public class les1n2 {
    public static void main(String[] args) {
        int[] num = {3, 4, 5};
        int a=0;


            if (num[0] > num[1] + num[2]) {
                a++;
            }
            else if(num[1] > num[0] + num[2]){
                a++;
            }
            else if(num[2] > num[0] + num[1]){
                a++;
            }
            if(a==0) {
                System.out.println("Треугольник существует");
            }
            else {
                System.out.println("Треугольник не существует");
            }

    }
}
