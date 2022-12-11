package by.omega.basic.main;

import java.util.Random;

/*
 * Вычислите значения функции на отрезке [a,b] c шагом h;
 *y= x при х>2
 *y=-x, при x<=2 
 */

public class TaskBasic13 {

	public static void main(String[] args) {
		int y;
		int a;
		int b;
		int h;

		Random rand = new Random();

		a = rand.nextInt(10) + 1;
		h = rand.nextInt(3) + 1;
		b = rand.nextInt(10) + a + h;

		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("h= " + h);

		for (int x = a; x <= b; x = x + h) {
			if (x > 2) {
				y = x;
			} else {
				y = -x;

			}

			System.out.println("При х= " + x + " y= " + y);
		}

	}

}
