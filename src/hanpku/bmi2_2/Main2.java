package hanpku.bmi2_2;


abstract class Karada {
	private double max;
	private double min;
	private String name;
	private double hei;
	private double wei;

	public Karada(String name, double hei, double wei, double max, double min) {
		this.name = name;
		this.hei = hei;
		this.wei = wei;
		this.max = max;
		this.min = min;
	}

	public String getName() {
		return name;
	}

	public double getHei() {
		return hei;
	}

	public double getWei() {
		return wei;
	}

	public double getMax() {
		return max;
	}

	public double getMin() {
		return min;
	}

}


class Human extends Karada {
	public Human(String name, double hei, double wei) {
		super(name, hei, wei, 25.0, 18.5);
	}

}

class Child extends Karada {
	public Child(String name, double hei, double wei) {
		super(name, hei, wei, 18.0, 15.0);
	}
}

class BMI {
	public static double calc(Karada k) {
		return k.getWei() / k.getHei() / k.getHei();
	}

	public static String judge(Karada k) {
		double x = calc(k);
		if(x < k.getMin()) {
			return "痩せすぎです";
		} else if(k.getMin() < x && x < k.getMax()) {
			return "標準です";
		} else {
			return "太りすぎです";
		}
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