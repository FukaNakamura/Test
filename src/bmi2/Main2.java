package bmi2;

abstract class Body {
	//共通部分であるname,heignt,weightをスーパークラスBodyに定義
	//ゲッターとセッターを作ってあげる
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
		super(name, height, weight, 25.0, 18.5);
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


public class Main2 {

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

