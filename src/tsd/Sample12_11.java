package tsd;

import java.util.Arrays;
import java.util.Comparator;

public class Sample12_11 {

	public static void main(String[] args) {

		String[] str = {"Michiko", "Satoshi", "Chieko"};

		//ソートなしでの使用
		System.out.println("ソートなし-----");
		for(String s : str) System.out.print(s + " ");
		System.out.println("\nChieko = " + Arrays.binarySearch(str, "Chieko"));

		//ソート後の使用
		Arrays.sort(str);
		System.out.println("ソートあり-----");
		for(String s : str) System.out.print(s + " ");
		System.out.println("\nChieko = " + Arrays.binarySearch(str, "Chieko"));

		//Comparatorを使用
		System.out.println("ソートあり（Comparator）-----");
		MyReverseSorter ms = new MyReverseSorter();
		//sort()メソッドの第二引数にComparator
		//実装クラスのオブジェクトを渡す
		Arrays.sort(str, ms);
		for(String s : str) System.out.print(s + " ");

		//Comparator実装クラスのオブジェクトを
		//渡さなかった場合
		System.out.println("\nChieko = " + Arrays.binarySearch(str, "Chieko"));
		//渡した場合
		System.out.println("Chieko = " + Arrays.binarySearch(str, "Chieko", ms));
	}

}


class MyReverseSorter implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}

}


