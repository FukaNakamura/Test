package kadai;

import java.util.Random;
import java.util.Scanner;

public class Kadai45_Other {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("要素数：");
		int count = scn.nextInt();
		scn.close();

		int[] arr = new int[count];
		for(int i = 0; i < arr.length; i++) {
			//ランダム数字代入
			arr[i] = new Random().nextInt(10) + 1;
		}


		for(int j = 10; j > 0 ; j++) {
			for(int i = 0; i < arr.length; i++) {
				if(i <= arr[i]) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println(); // 改行
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.print("--");
		}
		System.out.println();

		for(int i = 0; i < arr.length; i++) {
			System.out.print((i % 10) + " ");
		}

	}

}
