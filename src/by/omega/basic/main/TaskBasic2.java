package by.omega.basic.main;

import java.util.Random;

/*��������� �������� ��������� �� �������
 * (��� ���������� ��������� �������������� ��������)
 * b+������(b*b+4*a*c)/2*a-a*a*a*c-1/(b*b)
 */

public class TaskBasic2 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;

		Random rand = new Random();
		a = rand.nextDouble() * 10;
		b = rand.nextDouble() * 10;
		c = rand.nextDouble() * 10;

		System.out.println("� = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		System.out.println("�������");

		z = (b + (Math.sqrt(b * b + 4 * a * c))) / 2 * a - a * a * a * c - 1 / (b * b);

		System.out.println("b+������(b*b+4*a*c)/2*a-a*a*a*c-1/(b*b) = " + z);
	}

}
