package com.nowcoder.part06;

import java.util.Scanner;

/*
 * if���ĵ�һ����ʽ
 * */

public class IfDemo1 {

	public static void main(String[] args) {
		// 1��������
		Scanner scan = new Scanner(System.in);
		System.out.println("�������������!");
		int age = scan.nextInt();
		scan.close();
		// �ж�
		if (age >= 18) {
			System.out.println("�ѳ��꣬׼��");
		}
	}

}