package com.nowcoder.part06;

import java.util.Scanner;

/*
 * if语句的第一种形式
 * */

public class IfDemo1 {

	public static void main(String[] args) {
		// 1输入年龄
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入你的年龄!");
		int age = scan.nextInt();
		scan.close();
		// 判断
		if (age >= 18) {
			System.out.println("已成年，准入");
		}
	}

}
