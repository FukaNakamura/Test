package kadai;

import java.util.ArrayList;
import java.util.Scanner;

public class Kadai46_2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner (System.in); //これスキャンやん

		System.out.print("人数："); //ここ人数設定やん、ここやん？
		int count = scn.nextInt();

		ArrayList<Integer> a = new ArrayList<>(count); // ここ書き換え箇所
//		int[] a = new int[count];

		System.out.println("点数を入力せよ。"); //ここ数値入力やん
		for(int i = 0; i < count; i++) {
			System.out.print((i + 1) + "番目の点数：");

			//配列に格納
//			a[i] = scn.nextInt();
			a.add(scn.nextInt()); // ここ書き換え箇所
		}

		int sum = 0;
		int max = 0; // int max = x[0];で予め配列を入れておくのもアリ
		int min = 999999;

//		//for文で作った場合のArray変換方法
//		for(int i = 0; i < count; i++) {
////			sum += a;
//			sum += a.get(i); //←これ。
//		}

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
		System.out.println("平均点は" + ((double) sum / a.size()) + "点です。");
		//データ型の変換((double) sum / a.length)で出来る→小数点まで求まる
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");

		scn.close();
	}

}
