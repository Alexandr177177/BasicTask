package by.omega.basic.main;

import java.util.Random;

/*
 * Даны два числа.
 * Определить цифры, входящие в запись как первого так и второго числа
 */

public class TaskBasic19 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int value2;
		boolean k;

		Random rand = new Random();

		a = rand.nextInt(9000);
		b = rand.nextInt(9000);
		System.out.println("Первое число =" + a);
		System.out.println("Второе число =" + b);

		while (a >= 1) {

			c = a % 10;
			a = Math.round(a / 10);
			value2 = b;

			do {// поиск цифры первого числа в записи второго числа
				k = false;
				if (c == value2 % 10) {
					k = true;
					System.out.println("Цифра первого числа входит в запись второго числа =" + c);
				}

				value2 = Math.round(value2 / 10);
			} while (value2 >= 1 && k == false);
		}
	}

}
