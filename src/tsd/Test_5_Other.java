package tsd;

public class Test_5_Other {

	public static void main(String[] args) {
		System.out.println("main start.");

		//メソッドの呼び出し元

		Hoge h1 = new Hoge();
		h1.method1(); //メソッドの呼び出し
//		メソッドの定義側のほうに処理が飛んでいく（20行目）
//		処理が終わったら、戻ってきて下の記述部分を継続して行っている。

		h1.method2("hogehoge"); //hogehogeがインプット

		String s = h1.method3();//helloがアウトプット
		//右辺を先に実行したため、String s = "hello";
		System.out.println(s);
		// ＝System.out.println(h1.method3());

		int result = h1.method4(123, 456);
		System.out.println(result);

		System.out.println("main finish.");
	}

}

//class内にclass書くのは高等テクなので、基本はclass外にclassを記述すること
class Hoge{
	//引数・戻り値なし
	void method1() {
		System.out.println("method1 called.");
	}

	// 引数あり・戻り値なし
	void method2(String s) { // s = "hogehoge"; が不可視で入る
//		インプットから渡されたデータを元に処理をしている。
		System.out.println("method2 called.");
		System.out.println(s); //引数のs
	}

	// 引数なし・戻り値あり
	String method3() {
		System.out.println("method3 called."); //returnがないとエラー
		String h = "hello";
		return h; //データ型を揃える
		// 戻り値：メソッドの結果を呼び出し元に返す。
	}

	// 引数・戻り値あり
	int method4(int x, int y) {
		System.out.println("method4 called.");
		int z = x + y;
		return z;
	}


}

