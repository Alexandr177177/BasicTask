package by.omega.basic.main;

import java.util.Random;

/*
 * ���� �������������� ����� R ���� nnn.ddd (��� �������� ������
 * � ������� � ����� ������). �������� ������� ������� ������ �����
 *  ����� � ������� ���������� �������� �����
 * 
 */

public class TaskBasic4 {

	public static void main(String[] args) {

		double x = 0;
		int integer;
		int remainder;

		Random rand = new Random();
		while (x < 0.1) {// �������� �� ����������� ��������
			x = rand.nextDouble();
		}

		x = Math.round(x * 1000000) / 1000.0;
		System.out.println("�������� ����� = " + x);

		System.out.println(" ������� ");

		integer = (int) x;
		System.out.println("�������� ����� ����� =" + integer);

		x = (x - integer) * 1000;
		remainder = (int) (Math.round(x));
		System.out.println("�������� ������� =" + remainder);

		x = ((double) integer + (double) (remainder * 1000)) / 1000;

		System.out.println("����� =" + x);

	}
}