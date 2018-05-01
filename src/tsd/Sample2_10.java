package tsd;

public class Sample2_10 {

	public static void main(String[] arge) {
		String str = "きつね";

		System.out.println(str.charAt(0));//1文字ずつ取り出す
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));

		System.out.println(str.indexOf("つ"));//文字の位置
		System.out.println("何文字？>>>>" + str.length());//文字数
		System.out.println(str.toString());//strが参照している文字列
	}

}
