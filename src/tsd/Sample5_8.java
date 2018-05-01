package tsd;

class Car2{
	String color;
	int num;
	double gas;

	public Car2(String c, int n, double g) {
		color = c;
		num = n;
		gas = g;
	}

	public void show() {
		System.out.println("車の色は" + color + " ナンバーは[" + num + "] 燃料は[" + gas + "]");
	}
}

public class Sample5_8 {

	public static void main(String[] args) {
		Car2 [] cars = {new Car2("red", 100, 20.5),
						new Car2("blue", 200, 30.5),
						new Car2("green", 300, 40.5),};

		for(Car2 car : cars) {
			car.show();
		}

//		//別の書き方にすると…
//		for(int i = 0; i < cars.length; i++) {
//			cars[i].show();
//		}

	}

}
