//В методе main объявить три переменные типа int и присвоить первой числовое значение,
//вторая переменная равна первой переменной увеличенной на 3, а третья переменная равна сумме первых двух.
//Вывести результат на консоль.

import java.util.Scanner;

public class LessonTwoFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_1 = scanner.nextInt();
        int num_2 = num_1 + 3;
        int num_3 = num_1 + num_2;
        System.out.println("Числа: " + num_1 + ", " + num_2 + ", " + num_3);


    }
}
