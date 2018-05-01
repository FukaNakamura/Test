package kadai;

import java.util.ArrayList;

class Katana {
	String name;
	String type;
	String kana;

	public Katana(String n, String t, String k) {
		name = n;
		type = t;
		kana = k;
	}

	public void show() {
		System.out.println("名前：" + name + "、種類：" + type + "、読み仮名：" + kana);
	}
}


public class MainKatana {

	public static void main(String[] args) {

		ArrayList<Katana> katanas = new ArrayList<>(2);

		// addの中にインスタンスを入れてあげる
		katanas.add(new Katana("大包平", "太刀", "オオカネヒラ"));
		katanas.add(new Katana("鬼切丸", "太刀", "オニキリマル"));
		katanas.add(new Katana("和泉守兼定", "打刀", "イズミノカミカネサダ"));

		//で、showで呼び出す
//		for(Katana katana : katanas) {
//			katana.show();
//		}

		for(int i = 0; i < katanas.size(); i++) {
			katanas.get(i).show();
		}
	}


}
