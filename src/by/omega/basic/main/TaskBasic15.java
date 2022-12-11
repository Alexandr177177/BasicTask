package by.omega.basic.main;

/*
 * Составить программу для нахождения произведения квадратов 
 * первых двухсот чисел
 */

public class TaskBasic15 {

	public static void main(String[] args) {
		long s;
		s = 1;

		for (int i = 1; i <= 200; i++) {
			if (s >= (Math.pow(2, 63) - 1) / (i * i)) {
				System.out.println("Sorry. Произошло переполнения массива, опреция прервана при числе = " + i);
				break;
			}
			s = s * i * i;
		}

		System.out.println(" Произведение квадратов = " + s);

	}

}
