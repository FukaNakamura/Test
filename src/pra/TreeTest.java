package pra;

import java.util.TreeSet;

public class TreeTest {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();

		for(int i = 0; i < 999999; i++) {
			ts.add(i);
		}

		System.out.print("TreeSetによる要素999999へのアクセス速度：");
		long s2 = System.currentTimeMillis();

		for(int i = 0; i < 999999; i++) {
			ts.contains(999999);
		}
		long e2 = System.currentTimeMillis();

		System.out.println((e2 - s2) + " ms");

	}

}
