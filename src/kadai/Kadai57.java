package kadai;

import java.util.Scanner;

public class Kadai57 {

	public static void main(String[] args) {
		Test57 t1 = new Test57();

		Scanner scn = new Scanner (System.in);
		System.out.print("整数x：");
		int n = t1.signOf(scn.nextInt());
		scn.close();

		System.out.println("signOf(x)は " + n + " です。");
	}

}

class Test57{
	int signOf(int n) {

		if(n == 0) {
			int x = 0;
			return x;
		} else if(0 < n) {
			int x = 1;
			return x;
		} else {
			int x = -1;
			return x;
		}

	}
}