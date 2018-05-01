package tsd;


class ObjectOne {
	private int x;
	private int y;
	ObjectOne(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ObjectTwo {
	private int x;
	private int y;
	ObjectTwo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object o) {
		ObjectTwo ot;
		if(o instanceof ObjectTwo) {
			ot = (ObjectTwo) o;
			return ot.x == this.x && ot.y == this.y;
		}
		return false;
	}
}


public class Sample12_1 {

	public static void main(String[] args) {

		ObjectOne obj1 = new ObjectOne(1, 2);
		ObjectOne obj2 = new ObjectOne(1, 2);
		ObjectTwo obj3 = new ObjectTwo(1, 2);
		ObjectTwo obj4 = new ObjectTwo(1, 2);

		if(obj1.equals(obj2)) {
			System.out.println("obj1 is equal to obj2");
		} else {
			System.out.println("obj1 is not equal to obj2");
		}

		if(obj3.equals(obj4)) {
			System.out.println("obj3 is equal to obj4");
		} else {
			System.out.println("obj3 is not equal to obj4");
		}
	}

}
