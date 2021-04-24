package src;

//=======================超市购物超过500就打0.9折================

import java.util.Scanner;

public class ShoppingDemo {

	public static void main(String[] args) {
		double price = 128.00;

		// 输入购买数量
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入购买数量");
		int amount = scan.nextInt();
		scan.close();

		// 计算实付数量
		double total = price * amount;
		total = total > 500 ? total * 0.9 : total;

		// 提示支付结果
		System.out.println("请支付:" + total + "元");

	}

}
