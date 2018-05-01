package hanpku;

import java.util.function.Predicate;

public class Hanpuku425 {

	public static void main(String[] args) {

		//implements
		PredicateImpl pre1 = new PredicateImpl();
		System.out.println(pre1.test("うえええええええええええええ"));

		//匿名クラス
		Predicate<String> pre2 = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() >= 10;
			};
		};
		System.out.println(pre2.test("おおおおおおおおお"));

		//ラムダ式
		Predicate<String> pre3 = (String t) -> {
			return t.length() >= 10;
		};
		System.out.println(pre3.test("はい"));

	}

}

class PredicateImpl implements Predicate<String> {

	@Override
	public boolean test(String t) {
		return t.length() >= 10;
	}

}