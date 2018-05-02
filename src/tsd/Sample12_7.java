package tsd;

import java.util.HashMap;
import java.util.Map;

public class Sample12_7 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("1", "aaa");
		map.put("2", "bbb");

		// error
//		for(String s : map) {
//			System.out.println(s);
//		}

		// キーの一覧を表示する
		for(String s : map.keySet()) {
			System.out.print(s + " ");
		}
		System.out.println();


		// 値の一覧を表示する
		for(String s : map.values()) {
			System.out.print(s + " ");
		}
		System.out.println();


		// 両方表示する
		for(Map.Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}

}
