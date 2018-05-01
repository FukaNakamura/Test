package tsd;

interface Subject {
	public void japanese();
	public void history();
}

class BlueSchool implements Subject {
	@Override
	public void japanese() {
		System.out.println("国語の授業");
	}

	@Override
	public void history() {
		System.out.println("日本史の授業");
	}

	public void ensoku() {
		System.out.println("遠足");
	}
}

public class Sample6_15 {

	public static void main(String[] args) {
		Subject s1 = new BlueSchool();

		s1.japanese();
		s1.history();

		BlueSchool bs1 = (BlueSchool) s1;
		bs1.ensoku();

	}

}
