package kadai;

public class Kadai08 {
	public static void main(String[] arge) {
		int a = 33;
		int b = 11;
		int c = 22;

		System.out.println("整数a：" + a);
		System.out.println("整数b：" + b);
		System.out.println("整数c：" + c);

		if (c > a && b > a) {
			System.out.println("最小値は" + a + "です。");
		} else if (a > b && c > b) {
			System.out.println("最小値は" + b + "です。");
		} else {
			System.out.println("最小値は" + c + "です。");
		}
	}

}
