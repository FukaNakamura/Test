package hanpku;

class Human {
	public static final double MAX = 25.0;
	public static final double MIN = 18.5;
	private String name;
	private double hei;
	private double wei;

	Human(String name, double hei, double wei) {
		this.name = name;
		this.hei = hei;
		this.wei = wei;
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
}

class Child {
	public static final double MAX = 18.0;
	public static final double MIN = 15.0;
	private String name;
	private double hei;
	private double wei;

	Child(String name, double hei, double wei) {
		this.name = name;
		this.hei = hei;
		this.wei = wei;
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
}

class BMI {

	public static double calc(Human h) {
		return h.getWei() / h.getHei() / h.getHei();
	}

	public static String judge(Human h) {
		double x = calc(h);
		if(x < Human.MIN) {
			return "痩せすぎです";
		} else if (Human.MIN < x && x < Human.MAX) {
			return "標準です";
		} else {
			return "太りすぎです";
		}
	}

	public static double calc(Child c) {
		return c.getWei() / c.getHei() / c.getHei();
	}

	public static String judge(Child c) {
		double x = calc(c);
		if(x < Human.MIN) {
			return "痩せすぎです";
		} else if (Human.MIN < x && x < Human.MAX) {
			return "標準です";
		} else {
			return "太りすぎです";
		}
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
