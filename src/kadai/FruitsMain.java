package kadai;

import java.util.ArrayList;

public class FruitsMain {

	public static void main(String[] args) {

		//インスタンス化
		Fruits fruits1 = new Fruits("orange","橙色",150);
		Fruits fruits2 = new Fruits("banana","黄色",100);
		Fruits fruits3 = new Fruits("apple","赤色",240);

		System.out.println(fruits1.getName() + fruits1.getColor() + fruits1.getPrice());
		System.out.println(fruits2.getName() + fruits2.getColor() + fruits2.getPrice());
		System.out.println(fruits3.getName() + fruits3.getColor() + fruits3.getPrice());

		FruitsBasckets fb = new FruitsBasckets(5);
		fb.put(new Fruits("りんご","あか",100));
		fb.put(new Fruits("りんご","あか",100));
		fb.put(new Fruits("りんご","あか",100));
		fb.put(new Fruits("りんご","あか",100));
		fb.put(new Fruits("りんご","あか",100));
		fb.put(new Fruits("りんご","あか",100));

		Fruits f1 = fb.take(1);
		System.out.println(f1.getName());

		}

	}



class Fruits {

	//属性定義
	private String name = "未記入";
	private String color = "未記入";
	private int price = 0;

	//コンストラクタ化

	public Fruits(String n, String c, int p) {
		name = n;
		color = c;
		price = p;
		}

	//属性をもどすメソッド
	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

}

class FruitsBasckets {
	private ArrayList<Fruits> fruitsList = new ArrayList<>();
	private int limit;

	public FruitsBasckets(int limit) {
		this.limit = limit;
	}

	public void put(Fruits fruits) {
		if(fruitsList.size() == limit) {
			System.out.println(fruits.getName() + "はもう入りません");
			return;
		}
		System.out.println(fruits.getName() + "が入りました");
		fruitsList.add(fruits);
	}

	public Fruits take(int index) {
		return fruitsList.remove(index);
	}

}
