package by.omega.basic.main;

import java.util.Random;

/*
 * Найти max{min(a,b),min(c,d)}
 */

public class TaskBasic8 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;

		Random rand = new Random();

		a = rand.nextInt(50);
		System.out.println("a= " + a);

		b = rand.nextInt(50);
		System.out.println("b= " + b);

		c = rand.nextInt(50);
		System.out.println("c= " + c);

		d = rand.nextInt(50);
		System.out.println("d= " + d);

		if (a > b) {
			a = b;
		}

		if (c > d) {
			c = d;
		}

		if (a < c) {
			a = c;
		}

		System.out.println("max{min(a,b),min(c,d)}= " + a);

	}

}