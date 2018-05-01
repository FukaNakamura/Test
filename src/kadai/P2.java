package kadai;

public class P2 {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("2､for文で、10から1までの数字をカンマ区切りで表示しなさい。");

		for (int i = x; i >= 1 ; i--) {

			if(i > 1) {
				System.out.print(i + ",");
			} else {
			System.out.println(i);
			}

		}

	}

}
