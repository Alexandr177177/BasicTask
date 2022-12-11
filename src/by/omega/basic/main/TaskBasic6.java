package by.omega.basic.main;

import java.util.Random;

/* Для данной области составить линейную программу,
 * которая печатает true, если точка с координатами (x,y) 
 * принадлежит закрашенной области,
 * и false  - в противном случае:
 */

public class TaskBasic6 {

	public static void main(String[] args) {
		int x;
		int y;
		int sign;

		Random rand = new Random();
		sign = rand.nextInt(1);
		if (sign == 0) {
			sign = -1;
		}
		x = sign * rand.nextInt(8);

		sign = rand.nextInt(1);
		if (sign == 0) {
			sign = -1;
		}
		y = sign * rand.nextInt(8);

		System.out.println("x= " + x);
		System.out.println("y= " + y);

		if (x <= 2 && x >= -2 && y <= 4 && y >= 0 || x <= 4 && x >= -4 && y <= 0 && y >= -3) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}