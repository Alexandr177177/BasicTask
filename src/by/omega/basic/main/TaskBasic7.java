package by.omega.basic.main;

import java.util.Random;

/* ���� ��� ���� ������������ ( � ��������).
 * ���������� ���������� �� ����� �����������,
 * � ���� ��, �� ����� �� �� �������������
 */

public class TaskBasic7 {

	public static void main(String[] args) {

		int x;
		int y;

		Random rand = new Random();

		x = rand.nextInt(150);
		System.out.println("������ ����= " + x);

		y = rand.nextInt(150);
		System.out.println("������ ����= " + y);

		if (180 > (x + y)) {
			System.out.println("����� ����������� ����������");
			if (x == 90 || y == 90 || (180 - (x + y)) == 90) {
				System.out.println("���� ������������� �������������");
			}
		} else {
			System.out.println("����� ����������� �� ����������");

		}

	}

}
