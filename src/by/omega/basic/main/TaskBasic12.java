package by.omega.basic.main;

import java.util.Scanner;

/*
 * Напишите программу, где пользователь вводит любое 
 * целое положительное число. А программа суммирует
 * все числа от 1 до введенного пользователем числа 
 */

public class TaskBasic12 {

	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		// говорим компилятору что мы осознано не исп. метод close()

		Scanner sc = new Scanner(System.in);

		int a;
		int sum = 0;
		System.out.print(">>    ");
		while (sc.hasNextInt() == false) {// Проверка входных значений
			sc.nextLine();
			System.out.print(">>    ");
		}
		a =Math.abs(sc.nextInt());

		System.out.println("A= " + a);

		if (a > 0) {
			for (int i = 1; i <= a; i++) {
				sum = sum + i;
			}
			System.out.println("\nРезультат= " + sum);
		} else {
			System.out.println("\nРезультат= " + sum);
		}

	}

}