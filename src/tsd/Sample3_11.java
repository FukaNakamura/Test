package tsd;

public class Sample3_11 {

	public static void main(String[] args) {
		// continueを用いた構文
		for (int i = 0; i < 10; i++) {

			if ((i % 3) == 0) {
				continue;
			}
			System.out.println("i = " + i);
		}

//		for (int i = 0; i < 10; i ++) {
//			if((i % 3) != 0) {
//				System.out.println("i = " + i);
//			}
//		}

		System.out.println("for文の後の処理");
	}

}
