package tsd;

public class Sample3_10 {

	public static void main(String[] args) {
		//breakを用いた構文
		for (int i = 0;; i++) {

			if (i==3) {
				break;
			}
			System.out.println("i = " + i);
		}

//		for (int i = 0; i < 3; i++) {
//			System.out.println("i = " + i);
//		}

		System.out.println("for文の後の処理");
	}

}
