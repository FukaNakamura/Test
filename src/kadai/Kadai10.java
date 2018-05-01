package kadai;

public class Kadai10 {
	public static void main(String[] arge) {
		int a = 55;
		int b = 33;
		int c = 44;
		//変数入れ替え前の数値表示。
		System.out.println("変数a：" + a);
		System.out.println("変数b：" + b);
		System.out.println("変数c：" + c);
		System.out.println("a≦b≦cとなるようにソートしました。");

		if(a > b && a > c && c > b) {
			int d = b;
			int e = c;
			c = a;
			b = e;
			a = d;
		}

		System.out.println("変数aは" + a + "です。");
		System.out.println("変数bは" + b + "です。");
		System.out.println("変数cは" + c + "です。");

	}
}
