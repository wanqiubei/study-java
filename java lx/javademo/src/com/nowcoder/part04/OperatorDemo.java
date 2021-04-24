package com.nowcoder.part04;

/*
 * ������ķ���
 * 1�����������-   +���ӷ�    -������  *���˷�  /������   %������   ++������   --���Լ�  
 * 2����ϵ�����-   > ����      < С��     >= ���ڵ���    <= С�ڵ���     == ���    != ����
 * 3���߼������-   &&-�루һ��Ϊ�ٶ�Ϊ�٣�  ||-����һ��Ϊ�涼Ϊ�棩  ��-�ǣ�ȡ����
 * 4����ֵ����� 5����Ԫ����� 6���ַ��������
 *  7��λ����� -    &
 * */

public class OperatorDemo {

	public static void main(String[] args) {
		// 1)���������
		// �������������Ȼ������
		System.out.println(5 / 2);
		System.out.println(5 % 2);

		// ++i,i++
		int i = 10;
		++i;
		System.out.println(i);
		i++;
		System.out.println(i);

		// ++a ��������������
		int a = 100;
		System.out.println(++a + 100);
		System.out.println(a);

		// b++ ������,������
		int b = 100;
		System.out.println(b++ + 100);
		System.out.println(b);

		// 2)��ϵ�����======================
		int score = 70;
		System.out.println(score >= 60);
		System.out.println(score == 100);
		System.out.println(score != 100);

		// 3)�߼������============
		int age = 32;
		double salary = 40000.00;
		boolean result = age < 30 && salary > 20000;
		System.out.println(result);

		result = age < 30 || salary > 20000;
		System.out.println(result);

		result = !(age < 30 || salary > 20000);
		System.out.println(result);

		// &&,||���ڶ�·
		System.out.println(salary > 50000 && ++age < 30);
		System.out.println(age);

		System.out.println(salary > 3000 || ++age < 30);
		System.out.println(age);

		// 4����ֵ�����
		salary = salary + 10000;
		System.out.println(salary);
		// ��salary��ֵ��ֵ��tosalary
		double topSalary = salary = salary + 10000; 
		System.out.println(salary);
		System.out.println(topSalary);

		// +=
		// salary += 10000����salary = salary + 10000
		salary += 10000;
		System.out.println(salary);

		// 5)��Ԫ�����
		String title = age > 30 ? "С���" : "С����";
		System.out.println(title);

		salary = salary > 50000 ? 50000 : salary;
		System.out.println(salary);

		// 6)�ַ��������
		String s1 = "���Ĺ��ʣ�" + salary;
		System.out.println(s1);
		String s2 = "�������䣺" + age;
		System.out.println(s2);
		
		//7)λ�����
		//��ͬ���Ƶ������ı�ʾ����
		//0b��ʾ������
		//System.out.println(0b1010);
		//0��ʾ�˽���
		//System.out.println(012);
		//0x��ʾʮ������
		//System.out.println(0xA);
		
		//��ν�ʮ����ת��Ϊ������
		System.out.println(Integer.toBinaryString(5));
		
		//
		
	}
	

}