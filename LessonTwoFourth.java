//В методе main объявить переменную типа double и присвоить ей произвольные числовые значения.
//Сделать явное приведение переменной к типу int.
//Результат вывести на консоль.

import java.util.Scanner;

public class LessonTwoFourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num_1 = scanner.nextDouble();
        System.out.println((int) num_1);


    }
}
