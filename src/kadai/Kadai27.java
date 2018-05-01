package kadai;

public class Kadai27 {
	public static void main(String[] args) {

		int n = 7;
		System.out.println("１からnまでの和を求めます。");
		System.out.println("ｎの値：" + n);


		int x = 0;
		for (int i = 1; i < n; i++) {
			System.out.print(i + " + ");
			x = x+i;
		}

		System.out.println(n + " = " + (x + n));


	}
}
