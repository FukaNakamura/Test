package tsd;

public class Test4_23 {

	public static void main(String[] args) {

		Test4_23 t = new Test4_23();

		new Int() {
			@Override
			public void method(String s) {
				System.out.println(s);
			}
		}.method("hello");;

		//匿名クラス、newしたメソッド内部に強引にいれてライドってる
		//先にインタフェースや呼び出されるメソッドを作ることで入力補完から間違いを減らせる
		t.testMethod(new Int() {
			@Override
			public void method(String s) {
				System.out.println(s);
			}
		}); //ここすごく分かりづらい

	}

	void testMethod(Int i) {
		System.out.println("testMethod");
		i.method("hello");
	}

}

//インタフェース
interface Int {
	public void method(String s);
}