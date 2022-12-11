package by.omega.basic.main;

import java.util.Random;

/* 
 * Найдите значение функции z= ((a-3)*b/2)+c
 */

public class TaskBasic1 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;

		Random rand = new Random();
		a = rand.nextInt(10);
		b = rand.nextInt(10);
		c = rand.nextInt(10);

		System.out.println("а = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		System.out.println("Решение \n");
		z = ((a - 3) * b / 2) + c;
		System.out.println("z= ((a-3)*b/2)+c = " + z);

	}

}
