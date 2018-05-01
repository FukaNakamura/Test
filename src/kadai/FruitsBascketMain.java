package kadai;

import java.util.ArrayList;

//import java.util.Scanner;
//
//class Fruits1 {
//
//	//属性定義
//	private String name;
//	private String color;
//	private int price;
//
//	//コンストラクタ化
//
//	public Fruits1(String n, String c, int p) {
//		name = n;
//		color = c;
//		price = p;
//		}
//
//	//属性をもどすメソッド
//	public String getName() {
//		return name;
//	}
//
//	public String getColor() {
//		return color;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//}
//
//class FruitsBascket {
////		Fruitsを入れるメソッド（put）
////	   ・Fruitsを取り出すメソッド（take）
//
//	public void put() {
//
//
//	}
//
//	public void take() {
//
//	}
//
//
//}
//
//
//public class FruitsBascketMain {
//
//		public static void main(String[] args) {
//
//			Scanner scn = new Scanner(System.in);
//
//			System.out.print("容量：");
//			int cnt = scn.nextInt();
//			int[] x = new int[cnt];
//
//			if(箱がいっぱいだった時にエラー吐く) {
//				System.out.println("籠の中は満杯です。");
//
//			}else if(putなら入れる動作) {
//
//			} else {
//				ここtakeじゃね？
//			}
//			}
//
////			for(int i = 0; i < cnt; i++) {
////				int scr = put;
////				x[i] = scr;
////			}
//
//
//
//			scn.close();
//			}
//
//		}
//
//


FruitsBasket fb = new FruitsBasket();
fb.put(new Fruits("りんご","あか",100));

Fruits f1 = fb.take(1);
System.out.println(f1.getName());


class FruitsBascket {
	private ArrayList<Fruits> fruits = new ArrayList<>();

	public void put(Fruits fruits) {
		fruitsList.add(e);
	}

	public take(int index) {
		return fruitsList.remove(index);
	}

}



