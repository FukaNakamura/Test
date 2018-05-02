package tsd;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Sample12_3 {

	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<>();
		String st1 = "ready";
		String st2 = "set";
		String st3 = "go";

		myList.add(st1);
		myList.add(st2);
		myList.add(st3);

		// JDK5.0以前の書き方
//		for(int i = 0; i < myList.size(); i++) {
//			String st = (String)myList.get(i);
//			System.out.println(st);
//		}

		// ジェネリックスを用いた書き方
		for(String st : myList) {
			System.out.println(st);
		}

		// Iteratorを用いた書き方
//		String st = null;
//		Iterator<String> itr = myList.iterator();
//		while(itr.hasNext()) {
//			st = itr.next();
//			System.out.println(st);
//		}

		// Stream APIを用いた書き方（ラムダ式）
		myList.stream().forEach(i -> System.out.println(i));

		// Stream APIを用いた書き方（匿名クラス）
		myList.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});


	}

}
