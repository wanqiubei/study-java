package com.nowcoder.part06;

import java.util.Scanner;

/*
 * if���ĵ�������ʽ
 * */

public class IfDemo3 {
	public static void main(String[] args) {
		// ����ɼ�
		Scanner scan = new Scanner(System.in);
		System.out.println("�������õ��ɼ�");
		int score = scan.nextInt();
		scan.close();

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("c");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
	}

}
