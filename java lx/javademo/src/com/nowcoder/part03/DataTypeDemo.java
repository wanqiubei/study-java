package com.nowcoder.part03;

/*
 * 整数类型（int,long,byte,short）
 * 浮点类型（小数类型）{float,double}
 * 不精确-------解决方案-java.math.BigDecimal,是java内置的类，用于精确计算
 * 字符类型 （char）
 * 布尔类型----真-true   假-false
 * */

public class DataTypeDemo {

	public static void main(String[] args) {
		// 1.直接写出的值叫直接量
		System.out.println(9);
		System.out.println(3.14);

		// 2.int
		// 直接写出的整数是int类型的直接量
		int i = 123;
		// 赋值超出范围编译会报错
		// i= 3000000000000;
		// 运算超出范围，结果错误
		i = 2147483647;
		System.out.println(i + 1);

		// 3.byte,short,long
		// int的直接量可直接赋值给long类型
		long l = 2;
		// long类型的直接量需要以l/L结尾
		l = 3000000000000000000l;
		// int直接量可直接赋值给byte，short，但不能超出其范围
		byte b = 4;
		short s = 2;

		// ==================================
		// 4.float,double
		// 直接写出的小数是double类型的直接量
		double d = 0.3;
		// float类型的直接量需要以f/F结尾
		float f = 0.4f;
		// 浮点数不精确
		System.out.println(3.3f + 0.1f);

		// =======================
		// 5.char
		char c1 = 'a';
		// 二进制前面加0b
		// char c2=0b01000001;
		// unicode(后面数字16进制)
		char c3 = '\u0041';
		// 转义字符
		char c4 = '\'';//点
		char c5 = '\t';//空格
		char c6 = '\\';//表示"\"
		char c7 = '\n';//换行
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		//字符串
		String str="hello";
		System.out.println(str);
		
		//===================
		//6.boolean
		boolean b1=true;
		boolean b2=false;
		System.out.println(b1);
		System.out.println(b2);
		//判断的结果是布尔值
		int age =25;
		System.out.println(age<18);

	}
}
