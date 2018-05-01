package kadai;


class Animal {
	protected int age;
	//引数ありのコンストラクタを作ったせいで、デフォルトが作られなくなった
	public Animal(int a) {
		age = a;
	}

	public void setAnimal(int a) {
		age = a;
	}

	public int getAnimal() {
		return age;
	}

	public void showWalk() {
		System.out.println("歩く");
	}

}

class Dog extends Animal {

	//①Amimalに引数ありのコンストラクタができたせいで、デフォルト無生成化
	//②コンストラクタが出来たので、こちらにもデフォルトコンストラクタが生成される
	//③Dogのデフォルトコンストラクタに、Amimalのデフォルトが自動生成される
	//④Amimal自体に引数ありが存在するため、デフォルトが存在しない矛盾が発生
	//⑤結果、コンパイルエラーになる。

	public Dog(int a) {
		super(a);
	}

	public void showBite() {
		System.out.println("噛みつく");
	}

}

class Cat extends Animal {

	public Cat(int a) {
		super(a);
	}

	public void showScratch() {
		System.out.println("ひっかく");
	}

}


public class DogCatMain {

	public static void main(String[] args) {

		Dog d1 = new Dog(0);
		d1.showWalk();
		d1.showBite();

		Cat c1 = new Cat(0);
		c1.showWalk();
		c1.showScratch();



	}

}
