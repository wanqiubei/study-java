package com.nowcoder.part03;

/*
 * �������ͣ�int,long,byte,short��
 * �������ͣ�С�����ͣ�{float,double}
 * ����ȷ-------�������-java.math.BigDecimal,��java���õ��࣬���ھ�ȷ����
 * �ַ����� ��char��
 * ��������----��-true   ��-false
 * */

public class DataTypeDemo {

	public static void main(String[] args) {
		// 1.ֱ��д����ֵ��ֱ����
		System.out.println(9);
		System.out.println(3.14);

		// 2.int
		// ֱ��д����������int���͵�ֱ����
		int i = 123;
		// ��ֵ������Χ����ᱨ��
		// i= 3000000000000;
		// ���㳬����Χ���������
		i = 2147483647;
		System.out.println(i + 1);

		// 3.byte,short,long
		// int��ֱ������ֱ�Ӹ�ֵ��long����
		long l = 2;
		// long���͵�ֱ������Ҫ��l/L��β
		l = 3000000000000000000l;
		// intֱ������ֱ�Ӹ�ֵ��byte��short�������ܳ����䷶Χ
		byte b = 4;
		short s = 2;

		// ==================================
		// 4.float,double
		// ֱ��д����С����double���͵�ֱ����
		double d = 0.3;
		// float���͵�ֱ������Ҫ��f/F��β
		float f = 0.4f;
		// ����������ȷ
		System.out.println(3.3f + 0.1f);

		// =======================
		// 5.char
		char c1 = 'a';
		// ������ǰ���0b
		// char c2=0b01000001;
		// unicode(��������16����)
		char c3 = '\u0041';
		// ת���ַ�
		char c4 = '\'';//��
		char c5 = '\t';//�ո�
		char c6 = '\\';//��ʾ"\"
		char c7 = '\n';//����
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		//�ַ���
		String str="hello";
		System.out.println(str);
		
		//===================
		//6.boolean
		boolean b1=true;
		boolean b2=false;
		System.out.println(b1);
		System.out.println(b2);
		//�жϵĽ���ǲ���ֵ
		int age =25;
		System.out.println(age<18);

	}
}
