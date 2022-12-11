package by.omega.basic.main;

import java.util.Random;

/* 
 * Даны три точки A(x1,y1),B(x2,y3) и C(x3,y3).
 * Определить будут ли они расположены
 * на одной прямой
 */

public class TaskBasic9 {

	public static void main(String[] args) {
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;
		int a;
		int b;
		int c;

		Random rand = new Random();

		x1 = rand.nextInt(20);
		System.out.println("x1= " + x1);
		y1 = rand.nextInt(20);
		System.out.println("y1= " + y1);

		x2 = rand.nextInt(20);
		System.out.println("x2= " + x2);
		y2 = rand.nextInt(20);
		System.out.println("y2= " + y2);

		x3 = rand.nextInt(20);
		System.out.println("x3= " + x3);
		y3 = rand.nextInt(20);
		System.out.println("y3= " + y3);

		/*
		 * Уравнение прямой, проходящей через две заданные точки (x1,y1) и (x2,y2), *
		 * имеет вид:(y1-y2)/(y2-y1)=(x-x1)/(x2-x1) или в общем виде (y1-y2)x + (x2-x1)y
		 * + (x1y2-x2y1)=0 Т.е. получили общее уравнение прямой линии на плоскости в
		 * декартовых координатах: Ax + By + c = 0
		 */
		a = y1 - y2;
		b = x2 - x1;
		c = x1 * y2 - x2 * y1;

		System.out.println("Исходное уравнение между двумя точками имеет вид");
		System.out.println(a + " * x +  " + b + " *y +  " + c + " =0");
		if ((a * x3 + b * y3 + c) == 0) {
			System.out.println(" Эти точки лежат на одной прямой");
		} else {
			System.out.println(" Эти точки не лежат на одной прямой");
		}
	}

}
