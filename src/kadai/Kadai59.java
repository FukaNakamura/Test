package kadai;

import java.util.Scanner;

public class Kadai59 {

	public static void main(String[] args) {
		Test59 t1 = new Test59();

		Scanner scn = new Scanner (System.in);
		System.out.print("整数a：");
		int a = scn.nextInt();
		System.out.print("整数b：");
		int b = scn.nextInt();
		System.out.print("整数c：");
		int c = scn.nextInt();
		scn.close();

		System.out.println("中央値は " + t1.med(a,b,c) + " です。");
	}

}

class Test59 {
	int med(int a, int b, int c) {
		//ここ中央値だすようにする。同数とかいうアホのせいで＝入れてる
		if (b < c && b <= a && a <= c) {
			return a;
		} else if (c < b && c <= a && a <= b) {
			return a;
		} else if (a < c && a <= b && b <= c) {
			return b;
		} else if (c < a && c <= b && b <= a) {
			return b;
		} else if (a < b && a <= c && c <= b) {
			return c;
		}  else {
			return c;
		}

	}

}
