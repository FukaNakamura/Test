package pra;

public class Pra424_3 {

	public static void main(String[] args) {

		SummaryImpl p1 = new SummaryImpl();
		System.out.println(p1.exec(10, 5));

		SummaryImpl p2 = new SummaryImpl() {
			@Override
			public int exec(int a, int b) {
				return a + b ;
			}
		};
		System.out.println(p2.exec(10, 5));

		Summary p3 = (a, b) -> {
			return a + b;
		};
		System.out.println(p3.exec(10, 5));

	}

}

class SummaryImpl implements Summary {

	@Override
	public int exec(int a, int b) {
		return a + b;
	}

}

interface Summary {
	public int exec(int a, int b);
}



//次のインターフェースがあります。
//interface Summary{
//	public int exec(int a, int b);
//}

//このインターフェースを実装して、引数のaとbの合計を返す
//プログラムをつぎの3パターンとも作成してください。
//	・implementsを使用（クラス名はSummaryImpl）
//	・匿名クラスを使用
//	・ラムダ式

//例）implementsを使用した場合の実行プログラム
//System.out.println(new SummaryImpl().exec(10, 5));