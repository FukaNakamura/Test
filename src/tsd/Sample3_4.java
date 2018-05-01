package tsd;

public class Sample3_4 {
//条件演算子（三項演算子）
	public static void main(String[] arge) {
		int age = 15;

		System.out.println("18歳以上ですか？");
		String str = age < 18 ? "18歳未満です。" : "18歳以上です。";

//		//if構文にした場合
//		String str;//変数宣言を外に出してあげないと有効にならない
//		if (age < 18) {
//			str = "18歳未満です。";
//		} else {
//			str = "18歳以上です。";
//		}

		System.out.println(str);
	}

}
