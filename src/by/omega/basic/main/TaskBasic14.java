package by.omega.basic.main;

/*
 * Вычислить сумму квадратов первых ста чисел
 */

public class TaskBasic14 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {

			sum = sum + i * i;
		}

		System.out.println(" Сумма квадратов = " + sum);
	}

}
