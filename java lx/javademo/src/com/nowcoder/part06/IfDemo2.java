package com.nowcoder.part06;

import java.util.Scanner;

/*
 * if语句的第二种形式
 * */

public class IfDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数！");
		int n = scan.nextInt();
		scan.close();

		if (n % 2 == 0) {
			System.out.println(n + "是整数");
		} else {
			System.out.println(n + "不是整数");
		}
	}

}
