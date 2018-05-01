package pra;

import java.util.HashSet;
import java.util.TreeSet;

public class Hash_Tree_Test {

	public static void main(String[] args) {
		// HashSetとTreeSetの速度の違い

		//HashSet
		HashSet<Integer> hs = new HashSet<Integer>();


		for(int i = 0; i <= 999999; i++) {
			hs.add(i);
		}

		System.out.print("HashSetによる要素999999へのアクセス速度：");
		long s1 = System.currentTimeMillis();

		for(int i = 0; i <= 999999; i++) {
			hs.contains(999999);
		}
		long e1 = System.currentTimeMillis();

		System.out.println((e1 - s1) + " ms");

		System.out.println();

		//TreeSet
		TreeSet<Integer> ts = new TreeSet<Integer>();

		for(int i = 0; i <= 999999; i++) {
			ts.add(i);
		}

		System.out.print("TreeSetによる要素999999へのアクセス速度：");
		long s2 = System.currentTimeMillis();

		for(int i = 0; i <= 999999; i++) {
			ts.contains(999999);
		}
		long e2 = System.currentTimeMillis();

		System.out.println((e2 - s2) + " ms");

	}

}

//試行結果
//
//１、
//HashSetによる要素999999へのアクセス速度：47 ms
//TreeSetによる要素999999へのアクセス速度：172 ms
//
//２、
//HashSetによる要素999999へのアクセス速度：63 ms
//TreeSetによる要素999999へのアクセス速度：155 ms
//
//３、
//HashSetによる要素999999へのアクセス速度：63 ms
//TreeSetによる要素999999へのアクセス速度：159 ms
//
//４、
//HashSetによる要素999999へのアクセス速度：64 ms
//TreeSetによる要素999999へのアクセス速度：172 ms
//
//５、
//HashSetによる要素999999へのアクセス速度：62 ms
//TreeSetによる要素999999へのアクセス速度：156 ms
