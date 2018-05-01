package kadai;

import java.util.Scanner;

public class Kadai46 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);

		System.out.print("人数：");
		int count = scn.nextInt();

		int[] a = new int[count];

		System.out.println("点数を入力せよ。");
		for(int i = 0; i < count; i++) {
			System.out.print((i + 1) + "番目の点数：");

			//配列に格納
			a[i] = scn.nextInt();
		}

		int sum = 0;
		int max = 0; // int max = x[0];で予め配列を入れておくのもアリ
		int min = 999999;
		for(int x : a) {
			sum += x;
			if(max < x) { //数値の置き換え、大きければ更新して小さければ更新しないようなプログラムを組んであげる
				max = x;
			}
			if(x < min) { //初期化で0にすると、どうしても0が出るためクソデカ数値を入れておく
				min = x;
			}
		}

		System.out.println("合計点は" + sum + "点です。");
		System.out.println("平均点は" + ((double) sum / a.length) + "点です。");
		//データ型の変換((double) sum / a.length)で出来る→小数点まで求まる
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");

		scn.close();
	}

}
