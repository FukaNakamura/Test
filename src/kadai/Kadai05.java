package kadai;

public class Kadai05 {

	public static void main(String[] arge) {
		int a = 30;
		int b = 20;

		System.out.println("整数a：" + a);
		System.out.println("整数b：" + b);

		if (a >= b) { // ここ最適化できそうな気がしないでもない…？
			System.out.println("大きいほうの値は" + a + "です。");
		} else {
			System.out.println("大きいほうの値は" + b + "です。");
		}


//		三項演算子で記入
//		String str = a >= b ? "大きいほうの値は"+ a + "です。" : "大きいほうの値は" + b + "です。";
//		System.out.println(str);

	}

}
