package by.omega.basic.main;

import java.util.Scanner;

/*
 * Для каждого натурального числа в промежутке от m до n
 * вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры
 */

public class TaskBasic18 {

	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		// говорим компилятору что мы осознано не исп. метод close()

		Scanner sc = new Scanner(System.in);

		int m;
		int n;
		int value;

		System.out.print(">>    ");
		while (sc.hasNextInt() == false) {// Проверка входных значений
			sc.nextLine();
			System.out.print(">>    ");
		}

		m = Math.abs(sc.nextInt());

		System.out.print(">>    ");
		while (sc.hasNextInt() == false) {// Проверка входных значений
			sc.nextLine();
			System.out.print(">>    ");
		}

		n = Math.abs(sc.nextInt());

		System.out.println("Значение  m  = " + m);
		System.out.println("Значение  n  = " + n);

		if (m > n) {

			value = m;
			m = n;
			n = value;
		}

		for (int i = m; i <= n; i++) {
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					System.out.println("Значение " + i + " имеет делитель = " + j);
				}
			}
		}

	}

}
