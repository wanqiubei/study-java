package com.nowcoder.part06;

/*
 * if����ע������
 * */
public class IfDemo4 {

	public static void main(String[] args) {
		// ��ĳһ��ֻ֧��һ�д���ʱ����ʡ��{},��������������
		int score = 85;
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
		
		//����֮����а�����ϵʱ����Ҫ��������������д��ǰ��.
		if (score >= 60) {//��Ϊ����ֵ����60���Ժ�����������ȥ�ˣ����Ե�D
			System.out.println("D");
		} else if (score >= 70) {
			System.out.println("c");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 90) {
			System.out.println("A");
		} else {
			System.out.println("E");
		}

	}

}