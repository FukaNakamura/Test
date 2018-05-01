package kadai;

public class Kadai27_other {
	public static void main(String[] args) {

		int x = 7;
		System.out.println("１からnまでの和を求めます。");
		System.out.println("ｎの値：" + x);

		int sum = 0; //足すための箱を作っとく
		for (int i = 1; i <= x; i++) {
			sum = sum + i; //ここで足してる、sum += i;も可

			if (i < x) { //１～６まで
				System.out.print(i + " + ");
			} else { //７のとき
				System.out.print(i + " = ");
			}
		}

		System.out.println(sum);


	}

}
