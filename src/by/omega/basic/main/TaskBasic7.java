package by.omega.basic.main;

import java.util.Random;

/* Даны два угла треугольника ( в градусах).
 * Определить существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным
 */

public class TaskBasic7 {

	public static void main(String[] args) {

		int x;
		int y;

		Random rand = new Random();

		x = rand.nextInt(150);
		System.out.println("первый угол= " + x);

		y = rand.nextInt(150);
		System.out.println("второй угол= " + y);

		if (180 > (x + y)) {
			System.out.println("Такой треугольник существует");
			if (x == 90 || y == 90 || (180 - (x + y)) == 90) {
				System.out.println("Этот прямоугольник прямоугольный");
			}
		} else {
			System.out.println("Такой треугольник не существует");

		}

	}

}
