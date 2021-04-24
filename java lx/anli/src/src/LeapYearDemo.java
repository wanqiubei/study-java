package src;

//====================判断是否闰年=======================

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {

		// 输入年份
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份！");
		int year = scan.nextInt();
		scan.close();

		// 判断闰年
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0)
				|| year % 400 == 0;
		// System.out.println(a);
		// 提示
		String result = isLeapYear ? "是闰年" : "不是闰年";
		System.err.println(result);

	}
}
