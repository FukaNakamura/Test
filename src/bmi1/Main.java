package bmi1;

class Human {
	//閾値は定数にしてpublicにしてあげる
	public static final double MAX = 25.0;
	public static final double MINI = 18.5;

	private String name;
	private double height;
	private double weight;

	//コンストラクタ

	public Human(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	//private変数のゲッター設定
	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

}

class Child {
	public static final double MAX = 18.0;
	public static final double MINI = 15.0;

	private String name;
	private double height;
	private double weight;

	public Child() {
	}

	public Child(String name) {
		this.name = name;
	}

	public Child(String name, double height) {
		this.name = name;
		this.height = height;
	}

	public Child(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
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

}

class BMI {
	//ゲッターで呼び出してあげる
	public static double calc(Human h) {
		return h.getWeight() / h.getHeight() / h.getHeight();
	}

	//上で作った値をそのまま引用してあげる
	public static String judge(Human h) {
		double x = calc(h);
		if(x < Human.MINI) {
			return "痩せすぎです";
		} else if(Human.MINI <= x && x <= Human.MAX) {
			return "標準です";
		}
		return "太りすぎです";
	}

	public static double calc(Child c) {
		return c.getWeight() / c.getHeight() / c.getHeight();
	}

	public static String judge(Child c) {
		double x = calc(c);
		if(x < Child.MINI) {
			return "痩せすぎです";
		} else if(Child.MINI <= x && x <= Child.MAX) {
			return "標準です";
		}
		return "太りすぎです";
	}

}


public class Main {

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
