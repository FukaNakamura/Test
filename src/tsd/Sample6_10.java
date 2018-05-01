package tsd;


abstract class Carn {
	Carn(){
	System.out.println("自動車を作成します");
	}

	public abstract String setLight();
}

class CarA extends Carn {
	CarA(){
		System.out.println("A社のパーツを使います。");
	}
	public String setLight() {
		return "丸ライト";
	}
}

class CarB extends Carn {
	CarB(){
		System.out.println("B社のパーツを使います。");
	}
	public String setLight() {
		return "四角ライト";
	}
}


public class Sample6_10 {

	public static void main(String[] args) {

		Carn a1 = new CarA();
		System.out.println("ライトは" + a1.setLight() + "を取り付けました");

		System.out.println();

		Carn b1 = new CarB();
		System.out.println("ライトは" + b1.setLight() + "を取り付けました");
	}

}
