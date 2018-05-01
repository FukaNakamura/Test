package tsd;

public class Sample2_7 {
	public static void main(String[] args){
		int a = 10;
		int b = 2;

		System.out.println("a + b =" + (a + b)); // 加算
		// （）はずすと、a + b = 102
		System.out.println("a - b =" + (a - b)); // 減算
		// （）はずすと、コンパイルエラー
		System.out.println("a * b =" + (a * b)); // 乗算
		// （）はずすと、a + b = 20（以下、同等
		System.out.println("a / b =" + (a / b)); // 除算
		System.out.println("a % b =" + (a % b)); // 剰余
		System.out.println("-a    =" + (-a)); // 符号反転
	}

}
