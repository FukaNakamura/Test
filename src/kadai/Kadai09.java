package kadai;

public class Kadai09 {
	public static void main(String[] arge) {
		int a = 33;
		int b = 15;

		System.out.println("整数a：" + a);
		System.out.println("整数b：" + b);

		if (a > b) {
			System.out.println("小さいほうの値は" + b + "です。");
			System.out.println("大きいほうの値は" + a + "です。");
		} else if (a < b) {
			System.out.println("小さいほうの値は" + a + "です。");
			System.out.println("大きいほうの値は" + b + "です。");
		}

	}
}
