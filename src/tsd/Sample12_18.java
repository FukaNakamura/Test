package tsd;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Sample12_18 {

	public static void main(String[] args) {

		NavigableSet<String> set = new TreeSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("orange");
		set.add("lemon");
		set.add("grape");

		System.out.println(set);

		// 要素がセットに含まれている場合
		System.out.println("lower grape:" + set.lower("grape"));
		System.out.println("floor grape:" + set.floor("grape"));

		//要素がセットに含まれていない場合
		System.out.println("lower b:" + set.lower("b"));
		System.out.println("floor b:" + set.floor("b"));

		// 要素がセットに含まれている場合
		System.out.println("ceiling grape:" + set.ceiling("grape"));
		System.out.println("higher grape:" + set.higher("grape"));

		//要素がセットに含まれていない場合
		System.out.println("ceiling b:" + set.ceiling("b"));
		System.out.println("higher b:" + set.higher("b"));


		NavigableSet<String> sub = set.subSet("b", true, "m", true);
		System.out.printf("b - m : %s", sub);
	}

}
