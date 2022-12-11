package by.omega.basic.main;

import java.util.Random;

/*
 * Заданы размеры A,B прямоугольного отверстия
 * и размеры x, y, z кирпича. 
 * Определить пройдет ли кирпич через отверстие.
 */

public class TaskBasic10 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		int A;
		int B;

		Random rand = new Random();

		x = rand.nextInt(50) + 1;
		y = rand.nextInt(50) + 1;
		z = rand.nextInt(50) + 1;
		A = rand.nextInt(50) + 1;
		B = rand.nextInt(50) + 1;

		System.out.println(" x= " + x);
		System.out.println(" y= " + y);
		System.out.println(" z= " + z);
		System.out.println(" A= " + A);
		System.out.println(" B= " + B);

		if (A * B > x * y || A * B > y * z || A * B > x * z) {
			System.out.println(" кирпич пройдет");
		} else {
			System.out.println(" кирпич не пройдет");
		}

	}

}
