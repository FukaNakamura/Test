package kadai;

class Human {
	private String name;
	private int height;
	private int weight;

	public Human(String name, int height, int weight) {
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



public class Kadai84 {

	public static void main(String[] args) {

		Human suzuki = new Human("鈴木一郎", 180, 75);
		Human yamada = new Human("山田太郎", 165, 50);

		System.out.println("名前　　　　　：" + suzuki.getName());
		System.out.println("身長　　　　　：" + suzuki.getHeight());
		System.out.println("痩せる前の体重：" + suzuki.getWeight());
		suzuki.delWeight(13);
		System.out.println("痩せた後の体重：" + suzuki.getWeight());
		System.out.println();

		System.out.println("名前　　　　：" + yamada.getName());
		System.out.println("身長　　　　：" + yamada.getHeight());
		System.out.println("太る前の体重：" + yamada.getWeight());
		yamada.addWeight(22);
		System.out.println("太る後の体重：" + yamada.getWeight());


	}

}
