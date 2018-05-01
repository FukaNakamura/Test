package pra;

public class FruitsMain {

	public static void main(String[] args) {

		Fruits fru1 = new Fruits("orange", "橙", 120);
		Fruits fru2 = new Fruits("banana", "黄", 100);
		Fruits fru3 = new Fruits("apple", "赤", 200);


		System.out.println("名前：" + fru1.getName() + "、色：" + fru1.getColor() + "、価格：" + fru1.getPrice() + "円");
		System.out.println("名前：" + fru2.getName() + "、色：" + fru2.getColor() + "、価格：" + fru2.getPrice() + "円");
		System.out.println("名前：" + fru3.getName() + "、色：" + fru3.getColor() + "、価格：" + fru3.getPrice() + "円");

	}

}


class Fruits {
	private String name;
	private String color;
	private int price;

	public Fruits(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}
}