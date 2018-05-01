package kadai;


class Book {
	private String name;
	private int price;

	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void showRead() {
		System.out.println("読む。");
	}

}


class Manga extends Book {

	public Manga(String name, int price) {
		super(name, price);
	}

	public void showLook() {
		System.out.println("見る。");
	}

}

class Novel extends Book {

	public Novel(String name, int price) {
		super(name, price);
	}

	public void showImagne() {
		System.out.println("想像する。");
	}

}


public class MangaMain {

	public static void main(String[] args) {
		Manga m1 = new Manga("銀河鉄道999", 500);
		m1.showRead();
		m1.showLook();

		Novel n1 = new Novel("銀河鉄道の夜", 600);
		n1.showRead();
		n1.showImagne();

	}

}
