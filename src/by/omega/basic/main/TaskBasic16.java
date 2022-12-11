package by.omega.basic.main;

import java.util.Random;

/*
 * Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, 
 * модуль которых больше или равен заданному e.
 * Общий член ряда имеет вид:
 * an=1/2a^n+1/3a^n
 */
public class TaskBasic16 {

	public static void main(String[] args) {
		double e;
		double sum = 0;
		int n = 1;
		/*
		 * Так как ряд представляет собой бесконечною убывающую геометрическую
		 * прогрессию, то воспользуемся формулой: S = b1/{1-q} и получим max зн. ряда
		 * (1/2)/(1-1/2)+(1/3)/(1-1/3)=1.5
		 */
		Random rand = new Random();
		e = rand.nextDouble() + 0.5;
		System.out.println("e" + e);

		while (sum <= e) {
			sum = sum + 1 / (Math.pow(2, n)) + 1 / (Math.pow(3, n));
			n++;
		}

		System.out.println("sum" + n + " = " + sum);
	}
}
