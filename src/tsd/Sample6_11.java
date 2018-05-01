package tsd;

interface MyInterface {
	int a = 10;
	public void getComment();
}


interface SubInterface extends MyInterface {
	int getSum();
}

class C implements SubInterface {
	public void getComment() {
		System.out.println("スーパーインターフェイスを実装する");
	}
	public int getSum() {
		return (a + 5);

	}

}


public class Sample6_11 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.getComment();

		System.out.println(c1.getSum());
	}

}
