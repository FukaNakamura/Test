package kadai;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

//		Kuraberu k1 = new Kuraberu();

		Scanner scn = new Scanner (System.in);
		System.out.print("a: ");
		int a = scn.nextInt();
		System.out.print("b: ");
		int b = scn.nextInt();

		Kuraberu k1 = new Kuraberu();
		// ここ思い出した引数ない場合の属性セットのやつ
		k1.a = a;
		k1.b = b;

		System.out.println("大きいほうの値は " + k1.getBigger() + " です。");
		System.out.println("小さいほうの値は " + k1.getSmaller() + " です。");
		scn.close();
	}

}

class Kuraberu{
	int a;
	int b;

	int getBigger() {

		if(b < a) {
			return a;
		} else {
			return b;
		}

	}

	int getSmaller() {

		if(b < a) {
			return b;
		} else {
			return a;
		}

	}
}