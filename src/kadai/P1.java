package kadai;

public class P1 {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("1､for文で、1から10までの数字をカンマ区切りで表示しなさい。");

		for (int i = 1; i <= x; i++) {
			if(i < 10) {
				System.out.print(i + ",");
			} else {
				System.out.println(i);
			}
		}

	}

}
