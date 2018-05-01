package kadai;

import java.util.Random;
import java.util.Scanner;

public class Kadai63 {

	public static void main(String[] args) {
		//スキャナで数値入力→結果表示

		Test63 t1 = new Test63();

		System.out.println("乱数を生成します。");
		Scanner scn = new Scanner (System.in);
		System.out.print("下限値は：");
		int a = scn.nextInt();
		System.out.print("上限値は：");
		int b = scn.nextInt();
		scn.close();

		String str = b < a ? "上限値が下限値を下回りました。もう一度やり直してください。" : "生成した乱数は" + t1.random(a, b) + "です。";
		System.out.println(str);
	}

}

class Test63{
//	乱数生成するだけのメソッド
	int random(int a, int b) {

		int x = new Random().nextInt(b)+a;
		return x;

	}

}


