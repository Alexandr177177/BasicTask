package by.omega.basic.main;

import java.util.Random;

import static java.lang.Math.*;// функция с именем static import

/*
/*Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения)
 * (sinx+cosy)/(cosx-siny)*tg xy

 */

public class TaskBasic3 {

	public static void main(String[] args) {

		double x;
		double y;
		double value;

		Random rand = new Random();

		x = rand.nextDouble() * 180 - 90;
		System.out.println("x = " + x);

		y = rand.nextDouble() * 180 - 90;
		System.out.println("y= " + y);

		value = (sin(toRadians(x)) + cos(toRadians(y))) / (cos(toRadians(x) - sin(toRadians(y))))
				* tan(toRadians(x * y));

		System.out.println("\n Решение " + value);

	}
}