package com.nowcoder.part06;

import java.util.Scanner;

/*
 * if���ĵڶ�����ʽ
 * */

public class IfDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ��������");
		int n = scan.nextInt();
		scan.close();

		if (n % 2 == 0) {
			System.out.println(n + "������");
		} else {
			System.out.println(n + "��������");
		}
	}

}