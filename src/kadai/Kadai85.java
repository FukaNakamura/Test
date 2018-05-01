package kadai;

class Human2 {
	private String name;
	private int height;
	private int weight;

	public Human2(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public void delWeight(int w) {
		weight = (weight - w);
	}

	public void addWeight(int w) {
		weight = (weight + w);
	}

}


class HumanV2 extends Human2 {
	private Day happy;

	public HumanV2(String name, int height, int weight, Day happy) {
		super(name, height, weight);
		this.happy = happy;
	}

	public String toString() {
		String[] dayOfWeek = {"日","月","火","水","木","金","土"};

		return "{" + getName() + " " + getHeight() + "cm " + getWeight() + "kg "
				 + happy.getYear() + "年" + happy.getMonth() + "月" + happy.getDay() + "日("
				 + dayOfWeek[happy.dayOfWeek()] + ")生まれ}";
	}

}



class Day {

	private int year;
	private int month;
	private int day;

	public Day(int year) {
		this.year = year;
	}

	public Day(int year, int month) {
		this.year = year;
		this.month = month;
	}

	public Day(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;

	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int dayOfWeek() {
		return (year + year / 4 - year / 100 + year / 400 + (13 * month + 8) / 5 + 1) % 7;
	}

}


public class Kadai85 {
	public static void main(String[] args) {
		HumanV2 suzuki = new HumanV2("鈴木一郎", 180, 75, new Day(1972, 4, 26));
		HumanV2 yamada = new HumanV2("山田太郎", 165, 50, new Day(1988, 10, 3));

		System.out.println("suzuki = " + suzuki.toString());
		System.out.println();
		System.out.println("yamada = " + yamada.toString());
		System.out.println();
	}

}
