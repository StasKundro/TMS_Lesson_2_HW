//В методе main получить введенное с консоли слово и вывести на консоль выражение:
// введенное слово "и_тут_в_кавычках_должно_быть_введенное_слово".

import java.util.Scanner;

public class LessonTwoSixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String literal = scanner.nextLine();
        System.out.println("Введенное слово: " + literal);


    }
}
