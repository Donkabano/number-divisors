package by.ilyabychkovski.lineprograms.numberDivisors;
/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 *  m и n вводятся с клавиатуры.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение n:" );
        int n = scanner.nextInt();

        System.out.println("Введите значение m:" );
        int m = scanner.nextInt();

        for (int i = n; i <= m; i++) {
            boolean divisorNumbers = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    divisorNumbers = false;
                    break;
                }
            }
            if (divisorNumbers) {
                System.out.println(i);
            }
        }
    }
}