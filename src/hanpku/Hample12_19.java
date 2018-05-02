package hanpku;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Hample12_19 {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(12);
		array.add(123);
		array.add(1234);
		array.add(12345);
		array.add(123456);

		System.out.println("拡張for");
		for(int num : array) {
			if(num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
		System.out.println();

		System.out.println("Stream API");
		array.stream()
		.filter(num -> num % 2 == 0)
		.forEach(i -> System.out.print(i + " "));
		System.out.println();


		System.out.println("拡張for+if");
		ArrayList<Integer> array1 = new ArrayList<>();
		for(int num : array1) {
			if(num % 2 == 1) {
				if(num <= 100000) {
					array1.add(num);
				}
			}
		}
		System.out.println("array1:" + array1);


		System.out.println("Stream API");
		ArrayList<Integer> array2 = (ArrayList<Integer>)(array.stream()
				.filter(num -> num % 2 == 1)
				.filter(num -> num <= 100000)
				.collect(Collectors.toList()));
		System.out.println("array2:" + array2);
	}

}
