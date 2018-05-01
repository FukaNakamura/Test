package bmi3;


//定数→max、minくん
//voidでとりあえず返しとく、処理はHumanとかにやらせとく？

//今回実装を入れ替えなければいけない処理
//　→名前、身長、体重、BMI、体質
//　  そもそもpublicだからゲッターセッターつけなくていい

interface Karada {
	double max1 = 25.0;
	double min1 = 18.5;
	double max2 = 18.0;
	double min2 = 15.0;
}

interface Karada2 {



	public void getName();
	public void getHeight();
	public void getWeight();
}



abstract class Body {
	private double max;
	private double min;
	private String name;
	private double height;
	private double weight;

	public Body(String name, double height, double weight, double max, double min) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.max = max;
		this.min = min;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public double getMax() {
		return max;
	}

	public double getMin() {
		return min;
	}
}


class Human extends Body {
	//閾値以外は共通なので捨てて、コンストラクタを設定

	public Human(String name, double height, double weight) {
		super(name, height, weight, 25.5, 18.0);
	}

}

class Child extends Body {
	public Child(String name, double height, double weight) {
		super(name, height, weight, 18.0, 15.0);
	}

}

class BMI {

	public static double calc(Body body) {
		return body.getWeight() / body.getHeight() / body.getHeight();
	}

	public static String judge(Body body) {
		double x = calc(body);
		if(x < body.getMin()) {
			return "痩せすぎです";
		} else if(body.getMin() <= x && x <= body.getMax()) {
			return "標準です";
		}
		return "太りすぎです";
	}

}


public class Main3 {

	public static void main(String[] args) {
		Human h = new Human("kato", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(h.getName() + "さんのBMIは" + BMI.calc(h));
		System.out.println(BMI.judge(h));
		System.out.println("---------------");

		System.out.println();

		Child c = new Child("taro", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(c.getName() + "ちゃんのBMIは" + BMI.calc(c));
		System.out.println(BMI.judge(c));
		System.out.println("---------------");

	}

}

