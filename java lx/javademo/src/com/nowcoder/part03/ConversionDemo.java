package com.nowcoder.part03;

public class ConversionDemo {

	public static void main(String[] args) {
		// �Զ�����ת��
		char c = 'A';
		int i = c;
		System.out.println(i);

		long l = 100;
		double d = l;
		System.out.println(d);

		// ǿ������ת��
		int ii = 65;
		char cc = (char) ii;
		System.out.println(cc);

		double dd = 3.14;
		long ss = (long) dd;
		System.out.println(ss);

		// ����ʱ���Զ�����ת��
		// 1)�Ƚ�byte��short,charתΪint
		// 2)�ٽ�intתΪ���������
		char ccc = 'A';
		int iii = 100;
		double ddd = 3.14;
		System.out.println(ccc + iii + ddd);

		// ע�����µĿ�
		byte b = 8;
		b = (byte) (b - 3);
		System.out.println(b);

		// ���������Ĭ�Ϲ��򣬲�������ת��
		byte k = 5;
		short m = 6;
		char n = 7;
	}

}
