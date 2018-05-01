package pra;

import java.util.ArrayList;
import java.util.List;

public class FruitsBasketMain {

	public static void main(String[] args) {

		// フルーツバスケットを作る
		FruitsBasket fb = new FruitsBasket(3);
		// フルーツを入れる
		Fruits f1 = new Fruits("orange", "橙", 120);
		fb.put(f1);
		Fruits f2 = new Fruits("banana", "黄", 100);
		Fruits f3 = new Fruits("apple", "赤", 200);
		fb.put(f2);
		fb.put(f3);

		Fruits f4 = new Fruits("peach", "桃", 200);
		fb.put(f4);

		//バスケットからフルーツを取り出す
		Fruits f5 = fb.take(0);
	}

}

class FruitsBasket {
	private List<Fruits> bsk = new ArrayList<Fruits>();
	private int limit;

	public FruitsBasket(int limit) {
		this.limit = limit;
	}

	public void put(Fruits fruits) {
		if(bsk.size() >= limit) {
			System.out.println("バスケットはいっぱいです。");
			return;
		}
		bsk.add(fruits);
	}

	public Fruits take(int index) {
		return bsk.remove(index);
	}
}