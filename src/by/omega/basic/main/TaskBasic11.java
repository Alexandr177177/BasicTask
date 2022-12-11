package by.omega.basic.main;

import java.util.Random;

/*
 * Вычислить значение функции
 * F(x)= x*x-3*x+9, если x<=3;
 * F(x)= 1/(x*x+6), eсли х>3
 */

public class TaskBasic11 {

	public static void main(String[] args) {
		int f;
		int x;

		Random rand = new Random();

		x = rand.nextInt(10);
		System.out.println("x= " + x);

		if (x <= 3) {
			f = x * x - 3 * x + 9;
		} else {
			f = 1 / (x * x + 6);
		}
		System.out.println("F(x)= " + f);
	}

}
