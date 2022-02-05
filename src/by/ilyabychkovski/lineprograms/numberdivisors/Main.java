package by.ilyabychkovski.lineprograms.numberdivisors;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение n:");
        int n = scanner.nextInt();

        System.out.println("Введите значение m:");
        int m = scanner.nextInt();


        for (int i = n; i <= m; i++) {

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(i + " делится на: " + j);
                }
            }
        }
        scanner.close();
    }
}
