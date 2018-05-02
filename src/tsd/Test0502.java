package tsd;

public class Test0502 {

	public static void main(String[] args) {

		Foo<String> foo1 = new Foo<>();
		Foo<Integer> foo2 = new Foo<>();

	}

}

//Eを使用することで、汎用的に使用することが出来る
class Foo<E>{
	private E x;

	public void setX(E x) {
		this.x = x;
	}

	public E getX() {
		return x;
	}
}