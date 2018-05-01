package tsd;

public class Sample7_2 {

public static void main(String[] args) {
	int x = 15;
	int y = 0;

	try {
		System.out.println("x / y :" + x / y); //ArithmeticExceptionが発生
		System.out.println("2 * y :" + x * y); //この処理は実行されない
	} catch (ArithmeticException e) { //catchがあってもなくても実行結果的には同じ
		System.out.println("発生した例外:" + e);
	} finally {
		//finally内でエラーが発生した場合、エラー以降は実行されなくなる
		System.out.println("finallyブロック。必ず実行されます。");
	}
	System.out.println("x - y :" + (x - y)); //try-catch範囲外なので実行される
}

}

