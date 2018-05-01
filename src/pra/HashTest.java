package pra;

import java.util.HashSet;

public class HashTest {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();

		for(int i = 0; i < 999999; i++) {
			hs.add(i);
		}

		System.out.print("HashSetによる要素999999へのアクセス速度：");
		long s1 = System.currentTimeMillis();

		for(int i = 0; i < 999999; i++) {
			hs.contains(999999);
		}
		long e1 = System.currentTimeMillis();

		System.out.println((e1 - s1) + " ms");

	}

}
