//В методе main объявить две переменные типа int и присвоить им произвольные числовые значения.
//Для первой переменной вызвать операцию инкремента, для второй переменной вызвать операцию декримента.
//Результаты вывести на консоль

import java.util.Scanner;

public class LessonTwoThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();
        num_1++;
        num_2--;
        System.out.println("Числа: " + num_1 + ", " + num_2);


    }
}
