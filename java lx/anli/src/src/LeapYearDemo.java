package src;

//====================�ж��Ƿ�����=======================

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {

		// �������
		Scanner scan = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = scan.nextInt();
		scan.close();

		// �ж�����
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0)
				|| year % 400 == 0;
		// System.out.println(a);
		// ��ʾ
		String result = isLeapYear ? "������" : "��������";
		System.err.println(result);

	}
}