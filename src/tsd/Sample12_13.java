package tsd;

public class Sample12_13 {

	static Integer wi1; // 初期値 nullのため

	public static void main(String[] args) {
		 wi1++; // 実行時エラー
		Integer wi2 = 0;
		wi2++; // 演算可能
		Integer wi3 = 1;
		if(wi2 == wi3) { //本来はequalsにしないといけない
			System.out.println("Area: " + areaofSquare(4.0));

		}
	}

	public static Double areaofSquare(Double side) {
		return side * side; // 演算可能
	}
}
