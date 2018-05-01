package tsd;

import java.util.ArrayList;

public class Sample4_5 {

	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<String>();

		String st1 = "ready";
		String st2 = "set";
		String st3 = "go";
//		Integer i = 123;
		mylist.add(st1);
		mylist.add(st2);
		mylist.add(st3);
//		mylist.add(i); //コンパイルエラー

////		通常for文
//		 for(int i = 0; i < mylist.size(); i++){
//		 String st = mylist.get(i);
//		 System.out.println(st);
//		 }

//		拡張for文
		for(String st : mylist) {
			System.out.println(st);
		}

////		Iteratorを使用した取り出し
//		String st = null;
//		Iterator<String> itr = mylist.iterator();
//		while (itr.hasNext()) {
//			st = itr.next();
//			System.out.println(st);
//			}

	}

}
