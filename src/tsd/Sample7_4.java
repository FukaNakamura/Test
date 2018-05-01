package tsd;

import java.io.IOException;

public class Sample7_4 {

	public static void main(String[] args) throws IOException {
		double x = 15.0;
		double y = 0.0;

		try {
			Sample7_4 obj = new Sample7_4();
			//throwsで呼び出し元に戻されたのでthrowかtry-catchを追加してあげる
			double z = obj.doubleDivide(x,y);
			System.out.println("x / y : " + z);
		} catch(ArithmeticException ae) {
			System.out.println("-----発生した例外-----");
			System.out.println(ae);
		}
		System.out.println("x - y : " + (x - y));
	}

	//ここでthrowsして呼び出し元のobj.doubleDivide(x,y)に返してる
	double doubleDivide(double x, double y) throws IOException {
		if(y == 0.0) {
			throw new IOException ("数字は0では割れません。");
		} else {
			return x / y;
		}
	}
}
