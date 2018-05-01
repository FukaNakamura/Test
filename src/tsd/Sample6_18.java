package tsd;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample6_18 {

	public static void main(String[] args) {
		int a = 10;
		int b = -5;

		System.out.println("Math.PI = " + Math.PI);
		System.out.println("Math.E  = " + Math.E);
		System.out.println("Math.max(a,b) = " + Math.max(a, b));
		System.out.println("Math.min(a,b) = " + Math.min(a, b));
		System.out.println("Math.random() = " + Math.random());
		System.out.println("Math.abs(b) = " + Math.abs(b));
		System.out.println("Math.pow(a,b) = " + Math.pow(a, b));


		//ArrayListを配列に変換
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		String[] array1 = list1.toArray(new String[] {});
		System.out.println(Arrays.toString(array1));


		//配列をArrayListに変換
		String[] array2 = {"c", "d"};
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(array2));
		for(String s : list2) {
			System.out.println(s);
		}

	}

}
