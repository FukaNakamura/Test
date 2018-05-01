package tsd;

import java.util.ArrayList;

public class Sample4_4 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>(); //初期なし

		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);

		for(int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}

	}

}
