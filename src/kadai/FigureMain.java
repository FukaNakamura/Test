package kadai;

public class FigureMain {

	public static void main(String[] args) {

		Circle c1 = new Circle(10);
//		結果だします～
		System.out.println("円の面積:"+ c1.getArea());

		//↓正方形
		Square sq1 = new Square(20);
		System.out.println("正方形の面積：" + sq1.getArea());

		//↑正方形

		Cylinder cy1 = new Cylinder(8, c1);
		System.out.println("円柱の体積：" + cy1.getVolum());


	}

}

class Cylinder {
	//円柱→底面積(円→Circle)、高さ

	private int height;
	private Circle circle; //circleという属性を持ってることにする

	public Cylinder(int h, Circle c) {
		height = h;
		circle = c;
	}

	public Circle setCircle() {
		return circle;
	}

	public void setCircle(Circle c) {
		circle = c;
	}

	public double getVolum() {
		return circle.getArea() * height;
	}

}



class Circle {
	private int radius;

//	newされるときに呼び出されるもの、すでに決まっているもの
//	本来ならコンストラクタだけでいい。
	public Circle(int r) {
		radius = r;
	}
//	それとは別に呼び出されるもの、後から変更するもの
//	場合によっては、セッターを作って後から変更できるようにする
	public void setRadius(int r) {
		radius = r;
	}

//	属性がプライベートになってるから、そもそもゲッターがないと見れない
	public int getRadius() {
		return radius;
	}
//	ここ面積求める　…ここおかしい。引数なしなん
	double getArea() {
		double area = radius * radius * 3.14;
		return area;
	}

}


class Square {
	private int side;

	public Square(int si) {
		side = si;
	}

	public void setSquare(int si) {
		side = si;
	}

	public int getSquare() {
		return side;
	}

	int getArea() {
		int area = side * side;
		return area;
	}


}

