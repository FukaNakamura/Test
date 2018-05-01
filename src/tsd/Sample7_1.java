package tsd;

//例外処理　tryブロック-catchブロック

public class Sample7_1 {

	public static void main(String[] args) {
		int x = 15;
		int y = 0;

		try {
			System.out.println("x / y :" + x / y); //ArithmeticExceptionが発生
			System.out.println("2 * y :" + x * y); //この処理は実行されない
		} catch (ArithmeticException e) {
//			System.out.println("発生した例外:" + e);
//			e.printStackTrace(); //基本的にこれが使われる
			System.out.println(e.getMessage()); //これも使われる
		}
		System.out.println("x - y :" + (x - y)); //try-catch範囲外なので実行される
	}

}
