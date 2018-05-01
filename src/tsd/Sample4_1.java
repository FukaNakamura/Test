package tsd;

public class Sample4_1 {

	public static void main(String[] args) {

		int [] iar = new int [5]; //配列の宣言

		iar[0] = 12; //配列の初期化
		iar[1] = 3;
		iar[2] = 28;
		iar[3] = 427;
		iar[4] = 33;

		System.out.println("iar[0]の値は " + iar[0] + " です。"); //表示
		System.out.println("iar[1]の値は " + iar[1] + " です。");
		System.out.println("iar[2]の値は " + iar[2] + " です。");

		String[] sar = { "One" , "Two" , "Three"}; //配列の宣言と初期化

		System.out.println("sar[0]の値は " + sar[0] + " です。"); //宣言
		System.out.println("sar[1]の値は " + sar[1] + " です。");
		System.out.println("sar[2]の値は " + sar[2] + " です。");

		int len = sar.length;  //配列の要素数を取得
		System.out.println("配列sarの要素数は " + len + " です。"); //表示

	}

}
