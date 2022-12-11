package by.omega.basic.main;

import java.util.Random;

/*
 * Дано действительное число R вида nnn.ddd (три цифровых раряда
 * в дробной и целой частях). Поменять местами дробную ицелую часть
 *  числа и вывести полученное значение числа
 * 
 */

public class TaskBasic4 {

	public static void main(String[] args) {

		double x = 0;
		int integer;
		int remainder;

		Random rand = new Random();
		while (x < 0.1) {// проверка на трехзначное значение
			x = rand.nextDouble();
		}

		x = Math.round(x * 1000000) / 1000.0;
		System.out.println("Исходное число = " + x);

		System.out.println(" Решение ");

		integer = (int) x;
		System.out.println("Значение целой части =" + integer);

		x = (x - integer) * 1000;
		remainder = (int) (Math.round(x));
		System.out.println("Значение остатка =" + remainder);

		x = ((double) integer + (double) (remainder * 1000)) / 1000;

		System.out.println("Ответ =" + x);

	}
}