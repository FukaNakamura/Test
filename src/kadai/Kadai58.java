package kadai;

import java.util.Scanner;

public class Kadai58 {

	public static void main(String[] args) {
		Test58 t1 = new Test58();

		Scanner scn = new Scanner (System.in);
		System.out.print("整数a：");
		int a = scn.nextInt();
		System.out.print("整数b：");
		int b = scn.nextInt();
		System.out.print("整数c：");
		int c = scn.nextInt();
		scn.close();

		System.out.println("最小値は " + t1.min(a,b,c) + " です。");
	}

}

class Test58 {
	int min(int a, int b, int c) {

		if (a < c && a < b) {
			return a;
		} else if (b < a && b < c) {
			return b;
		} else {
			return c;
		}

	}
}