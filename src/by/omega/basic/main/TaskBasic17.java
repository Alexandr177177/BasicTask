package by.omega.basic.main;

/* 
 * Вывести на экран соответствий между символами 
 * и их численными обозначениями в памяти компьютера
 */

public class TaskBasic17 {

	public static void main(String[] args) {

		for (int i = 33; i <= 255; i++) {
			System.out.println(i + " " + (char) i);
		}

		System.out.println();

	}

}
