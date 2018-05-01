package tsd;

public class Test_0501 {

	public static void main(String[] args) {

		// 文字列結合の一種「printf」

		int x = 100;
		int y = 200;
		System.out.printf("文字列「%d」【%s】 \n", x, y);

		// %s … 文字列
		// %d … 整数（decimal
		// %,d … 3ケタ区切りの整数
		// %f … 小数点（intは使用できない
		// %.2f … 小数点2ケタまで表示
		// %n または \n … 改行

//		String s = String.format("文字列「%s」【%s】", x, y);
//		System.out.println(s);
	}

}
