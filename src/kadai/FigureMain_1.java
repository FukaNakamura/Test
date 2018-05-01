package kadai;

public class FigureMain_1 {

}

class Cylinder2 {
	//円柱→底面積(円→Circle)、高さ

	private int height;
	private Circle circle; //circleという属性を持ってることにする

	public Cylinder2(int h, Circle c) {
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

