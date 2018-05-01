package kadai;

public class Kadai07 {

	public static void main(String[] arge) {
		int a = 35;
		int b = 11;

		System.out.println("整数a：" + a);
		System.out.println("整数b：" + b);

		if (a - b > 10 || b - a > 10) {
			System.out.println("それらの差は11以上です。");
		} else {
			System.out.println("それらの差は10以下です。");
		}
	}

}
