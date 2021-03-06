package com.nowcoder.part04;

/*
 * 运算符的分类
 * 1）算术运算符-   +）加法    -）减法  *）乘法  /）除法   %）求余   ++）自增   --）自减  
 * 2）关系运算符-   > 大于      < 小于     >= 大于等于    <= 小于等于     == 相等    != 不等
 * 3）逻辑运算符-   &&-与（一个为假都为假）  ||-减（一个为真都为真）  ！-非（取反）
 * 4）赋值运算符 5）三元运算符 6）字符串运算符
 *  7）位运算符 -    &
 * */

public class OperatorDemo {

	public static void main(String[] args) {
		// 1)算术运算符
		// 两个整数相除依然是整数
		System.out.println(5 / 2);
		System.out.println(5 % 2);

		// ++i,i++
		int i = 10;
		++i;
		System.out.println(i);
		i++;
		System.out.println(i);

		// ++a 先自增，后运算
		int a = 100;
		System.out.println(++a + 100);
		System.out.println(a);

		// b++ 先运算,后自增
		int b = 100;
		System.out.println(b++ + 100);
		System.out.println(b);

		// 2)关系运算符======================
		int score = 70;
		System.out.println(score >= 60);
		System.out.println(score == 100);
		System.out.println(score != 100);

		// 3)逻辑运算符============
		int age = 32;
		double salary = 40000.00;
		boolean result = age < 30 && salary > 20000;
		System.out.println(result);

		result = age < 30 || salary > 20000;
		System.out.println(result);

		result = !(age < 30 || salary > 20000);
		System.out.println(result);

		// &&,||存在短路
		System.out.println(salary > 50000 && ++age < 30);
		System.out.println(age);

		System.out.println(salary > 3000 || ++age < 30);
		System.out.println(age);

		// 4）赋值运算符
		salary = salary + 10000;
		System.out.println(salary);
		// 将salary的值赋值给tosalary
		double topSalary = salary = salary + 10000; 
		System.out.println(salary);
		System.out.println(topSalary);

		// +=
		// salary += 10000等于salary = salary + 10000
		salary += 10000;
		System.out.println(salary);

		// 5)三元运算符
		String title = age > 30 ? "小姐姐" : "小妹妹";
		System.out.println(title);

		salary = salary > 50000 ? 50000 : salary;
		System.out.println(salary);

		// 6)字符串运算符
		String s1 = "她的工资：" + salary;
		System.out.println(s1);
		String s2 = "她的年龄：" + age;
		System.out.println(s2);
		
		//7)位运算符
		//不同进制的整数的表示方法
		//0b表示二进制
		//System.out.println(0b1010);
		//0表示八进制
		//System.out.println(012);
		//0x表示十六进制
		//System.out.println(0xA);
		
		//如何将十进制转化为二进制
		System.out.println(Integer.toBinaryString(5));
		
		//
		
	}
	

}
