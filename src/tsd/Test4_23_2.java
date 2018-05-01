package tsd;

import java.util.function.Predicate;

public class Test4_23_2 {

	public static void main(String[] args) {

		//オーソドックス
		Pre1 p1 = new Pre1();
		System.out.println(p1.test(100));


		//匿名クラス
		Predicate<Integer> p2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t == 1;
			}
		};
		System.out.println(p2.test(100));


		//ラムダ式（フル記述
		Predicate<Integer> p3 = (Integer t) -> {
			return t == 1;
		};
		System.out.println(p3.test(100));


		//ラムダ式（引数省略 ※複数ある場合は全引数省略
		Predicate<Integer> p4 = (t) -> {
			return t == 1;
		};
		System.out.println(p4.test(100));


		//ラムダ式（returnのみ{}とreturnを省略可
		Predicate<Integer> p5 = (t) -> t == 1;
		System.out.println(p5.test(100));


		//ラムダ式（最終形態
		Predicate<Integer> p6 = t -> t == 1;
		System.out.println(p6.test(100));

	}

}

class Pre1 implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t == 1;
	}

}