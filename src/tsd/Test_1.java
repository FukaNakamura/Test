package tsd;

import java.util.Scanner;

//入力させるためのやつ

public class Test_1 {
	public static void main(String[] args) {

		//実行結果に値を手動入力させる部分、以降これを使用する。
		Scanner scn = new Scanner (System.in); //お約束
		System.out.print("aを入力してください：");
		int a = scn.nextInt(); //aは自分でわかりやすい名前でどうぞ
		scn.close(); //お約束

		for (int i = 0; i < a; i++) {
			System.out.println(i);
		}


	}

}
