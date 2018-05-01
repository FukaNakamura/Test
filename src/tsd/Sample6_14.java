package tsd;

abstract class School {
	String name;
	abstract void getName();
	void setName(String n) {
		name = n;
	}
}

class Students extends School {
	void getName() {
		System.out.println("名前 ： " + name);
	}
}

public class Sample6_14 {

	public static void main(String[] args) {

		School s1 = new Students();
		s1.setName("山田");
		s1.getName();

	}

}
