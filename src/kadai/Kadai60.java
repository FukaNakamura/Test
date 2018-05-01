package kadai;

import java.util.Scanner;

public class Kadai60 {

	public static void main(String[] args) {
		Test60 t1 = new Test60();

		System.out.println("１からzまでの和を求めます。");
		Scanner scn = new Scanner (System.in);
		System.out.print("zの値：");
		int n = scn.nextInt();
		scn.close();

		System.out.println("1から"+ n + "までの和は " + t1.sumup(n) + " です。");
	}

}

class Test60 {

	int sumup(int n) {
		int sum = 0;
		int cnt = 1;
		while (cnt <= n) {
			sum += cnt;
			cnt++;
		}
		return sum;
	}

}
