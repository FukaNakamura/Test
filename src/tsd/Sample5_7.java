package tsd;

// コンストラクタ

class Trainer {
	String name;

	Trainer(){ //コンストラクタの定義、引数なし
		name = "名無し";
	}

	Trainer(String n) { //オーバーロード、引数１つ
		name = n;
	}
}


public class Sample5_7 {

	public static void main(String[] args) {

		Trainer s1 = new Trainer(); //5行目
		Trainer s2 = new Trainer("田中さん"); //12行目

		System.out.println("名前：" + s1.name);
		System.out.println("名前：" + s2.name);


	}

}
