package tsd;

class FinTest {
	final int a = 15;
	static final int b = 25;
	static int c = 35;
	public static FinTest f;
	int d = 45;
	int e;

	void method() {
		int f;
		System.out.println("a " + a);
		System.out.println("b " + b);
		System.out.println("c " + c);
		System.out.println("d " + d);
		System.out.println("e " + e);
	}
}

public class Sample6_5 {

	public static void main(String[] args) {
		FinTest.c = 50;

		FinTest f = new FinTest();
		f.method();

	}

}
