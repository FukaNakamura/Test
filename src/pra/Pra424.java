package pra;

import java.util.function.Predicate;

	// 書き直し
public class Pra424 {

	public static void main(String[] args) {

		//implements、30行目のclassがなくなると使えなくなる
		PredicateImpl p1 = new PredicateImpl();
		System.out.println(p1.test("文字数"));

		//匿名クラス
		Predicate<String> p2 = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() >= 10;
			}
		};System.out.println(p2.test("文字数文字数文字数文字数"));

		//ラムダ式
		Predicate<String> p3 = t -> t.length() >= 10;
		System.out.println(p3.test("文字数文字"));
	}

}


class PredicateImpl implements Predicate<String>{
	@Override
	public boolean test(String t) {
		return t.length() >= 10;
	}
}