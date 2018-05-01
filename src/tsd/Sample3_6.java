package tsd;

public class Sample3_6 {

	public static void main(String[] args) {

//		//for文のひな形
//		for (int i = 0; i < 10; i++) {
//			System.out.print(i);
//		}

		for (int x = 1; x <= 10; x++) {
			System.out.print(x);
		}

		System.out.println();//改行

		int y = 1;//初期化がfor文からお出かけしてても可
		for(; y <= 10; y++) {
			System.out.print(y);
		}
	}

}
