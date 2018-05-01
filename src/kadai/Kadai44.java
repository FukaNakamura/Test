package kadai;

import java.util.Scanner;

public class Kadai44 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("要素数：");
		int cnt = scn.nextInt();
		int[] x = new int[cnt];

		for(int i = 0; i < cnt; i++) {
			System.out.print("a[" + i + "] = ");
			int scr = scn.nextInt();
			x[i] = scr;
		}

		for(int i = 0; i < cnt; i++) {
			if(i == 0) {
				System.out.print("{" + x[i]);
			} else {
				System.out.print("," + x[i]);
			}
		}
		scn.close();
		System.out.println("}");
	}

}
