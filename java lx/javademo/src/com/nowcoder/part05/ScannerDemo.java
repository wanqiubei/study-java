package com.nowcoder.part05;

//=====================输入=========================
//引入
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {

		// 创建Scanner对象
		Scanner scan = new Scanner(System.in);

		// 开始输入
		System.out.println("请输入你的名字：");// 名字什么的属于字符段
		String name = scan.nextLine();

		System.out.println("请输入你的年龄！");// 年龄属于整数
		int age = scan.nextInt();

		System.out.println("请输入你的薪水！");// 薪水属于小数
		double salary = scan.nextDouble();

		// 关闭Scanner
		scan.close();

		// 处理输入结果
		System.out.println("姓名:" + name);
		System.out.println("年龄:" + age);
		System.out.println("薪水:" + salary);

	}

}
