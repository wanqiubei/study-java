package src;

//=======================���й��ﳬ��500�ʹ�0.9��================

import java.util.Scanner;

public class ShoppingDemo {

	public static void main(String[] args) {
		double price = 128.00;

		// ���빺������
		Scanner scan = new Scanner(System.in);
		System.out.println("�����빺������");
		int amount = scan.nextInt();
		scan.close();

		// ����ʵ������
		double total = price * amount;
		total = total > 500 ? total * 0.9 : total;

		// ��ʾ֧�����
		System.out.println("��֧��:" + total + "Ԫ");

	}

}
