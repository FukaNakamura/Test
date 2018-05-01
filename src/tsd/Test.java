package tsd;


public class Test{


	public static void main(String[] args) {
		// ここからmain

		String str1 = "hello";
		String str2 = "hello";
		String str3 = str1;
		String str4 = new String("hello");

		System.out.println("--- str1 ---");
		System.out.println("==:" + (str1 == str2));
		System.out.println("eq:" + str1.equals(str2));
		System.out.println("==:" + (str1 == str3));
		System.out.println("eq:" + str1.equals(str3));
		// 新規で作られたhelloを見てるためF
		System.out.println("==:" + (str1 == str4));
		// 文字列を見てるためT
		System.out.println("eq:" + str1.equals(str4));

		System.out.println();

		System.out.println("--- str2 ---");
		System.out.println("==:" + (str2 == str1));
		System.out.println("eq:" + str2.equals(str1));
		System.out.println("==:" + (str2 == str3));
		System.out.println("eq:" + str2.equals(str3));
		// １と同等
		System.out.println("==:" + (str2 == str4));
		System.out.println("eq:" + str2.equals(str4));

		System.out.println();

		System.out.println("--- str3 ---");
		System.out.println("==:" + (str3 == str1));
		System.out.println("eq:" + str3.equals(str1));
		System.out.println("==:" + (str3 == str2));
		System.out.println("eq:" + str3.equals(str2));
		// str3の参照先はstr1で、str1は同文
		System.out.println("==:" + (str1 == str4));
		System.out.println("eq:" + str1.equals(str4));

		System.out.println();

		System.out.println("--- str4 ---");
		System.out.println("==:" + (str4 == str1));
		System.out.println("eq:" + str4.equals(str1));
		System.out.println("==:" + (str4 == str2));
		System.out.println("eq:" + str4.equals(str2));
		System.out.println("==:" + (str4 == str3));
		System.out.println("eq:" + str4.equals(str3));

		System.out.println();
		// ここまでmain
		Object a = "hello";
		Object b = "hello";

		Object a = new Object("hello");
		Object b = "hello";

		System.out.println("==:" + (a == b));
		System.out.println("eq:" + a.equals(b));

	}
}
