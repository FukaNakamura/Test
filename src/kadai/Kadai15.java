package kadai;

import java.util.Scanner;

public class Kadai15 {

	public static void main(String[] args) {

		Scanner scn = new Scanner (System.in);
		System.out.print("整数：");
		String mozi = scn.next();

		try {
			int n = Integer.parseInt(mozi);
			if(n % 2 == 0) {
				System.out.println("入力された値は偶数です。");
			} else {
				System.out.println("入力された値は奇数です。");
			}

		} catch(NumberFormatException ne) {
			System.out.println("数字を入力してください");
		}

		scn.close();
	}

}
