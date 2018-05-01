package kadai;

public class Kadai04 {

	public static void main(String[] arge) {
		int x = 66;

		System.out.println("点数：" + x);
		if (x <0) {
			System.out.println("不正な点数です。");
		} else if (x<100 && x >= 80) {
			System.out.println("優");
		} else if (x >= 70) {
			System.out.println("良");
		} else if (x >= 60) {
			System.out.println("可");
		}else {
			System.out.println("不可");
		}
	}

}
