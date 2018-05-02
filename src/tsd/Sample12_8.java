package tsd;


class Super {
	void print() {
		System.out.println("Super");
	}
}

class Sub extends Super {
	void print() {
		System.out.println("Sub");
	}
}

// <型パラメータ extends データ型>
class Fooo<T extends Super> {
	private T val;

	public Fooo(T val) {
		this.val = val;
	}

	public void call() {
		val.print();
	}
}


public class Sample12_8 {

	public static void main(String[] args) {

		Super obj1 = new Super();
		Sub obj2 = new Sub();

		Fooo<Super> foo1 = new Fooo<>(obj1);
		foo1.call();
		Fooo<Sub> foo2 = new Fooo<>(obj2);
		foo2.call();
	}

}