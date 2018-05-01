package kadai;

import java.util.Scanner;

public class Kadai61 {

	public static void main(String[] args) {
		Test61 t1 = new Test61();

		Scanner scn = new Scanner (System.in);
		System.out.print("何月ですか（１～１２）：");
		int m = scn.nextInt();
		scn.close();

		//ifの乱用しすぎて意味が分からない

		if (t1.season(m) == 3) {
			System.out.println("その月の季節は春です。");
		} else if (t1.season(m) == 6) {
			System.out.println("その月の季節は夏です。");
		} else if (t1.season(m) == 9) {
			System.out.println("その月の季節は秋です。");
		} else if (t1.season(m) == 12) {
			System.out.println("その月の季節は冬です。");
		} else {
			System.out.println();
		}


	}

}

class Test61 {
	int season(int m) {

		//こんなに意味わからなくする意味あったのか分からん

		if (m == 3 || m == 4 || m == 5) {
			return 3;
		} else if (m == 6 || m == 7 || m == 8) {
			return 6;
		} else if (m == 9 || m == 10 || m == 11) {
			return 9;
		} else if (m == 12 || m == 1 || m == 2) {
			return 12;
		} else {
			return 0;
		}

	}

}