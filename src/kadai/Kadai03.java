package kadai;

public class Kadai03 {

	public static void main(String[] arge) {
		int a = 10;
//		int b = 5;

		System.out.println("整数値：" + a);
		if (a < 0) {
			System.out.println("正でない値が入力されました。");
		} else if (a % 5 == 0) {
			System.out.println("その値は５で割り切れます。");
		} else {
			System.out.println("その値は５で割り切れません。");
		}
	}

}
