package com.nowcoder.part06;

/*
 * if语句的注意事项
 * */
public class IfDemo4 {

	public static void main(String[] args) {
		// 当某一分支只含一行代码时可以省略{},不建议这样做。
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
		
		//条件之间具有包含关系时，需要将被包含的条件写在前面.
		if (score >= 60) {//因为给的值大于60所以后面条件进不去了，所以得D
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
