package by.omega.basic.main;

import java.util.Random;

/* Дано натуральное число T, которое представляет
 * длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах,
 * минутах и секундах в следующей форме;
 * ННч ММмин SSс.
 */

public class TaskBasic5 {

	public static void main(String[] args) {
		int t;
		int second;
		int minute;
		int hour;

		Random rand = new Random();
		t = rand.nextInt(50000);
		System.out.println("T= " + t);

		hour = t / 3600;
		minute = (t - hour * 3600) / 60;
		second = t - hour * 3600 - minute * 60;
		System.out.println("Ответ =" + hour + "ч " + minute + "мин " + second + "сек ");
	}

}
