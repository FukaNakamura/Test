package kadai;

public class P5 {

	public static void main(String[] args) {
		int x = 100;
		System.out.println("5､１から１００までの数値を縦に表示しなさい。");
		System.out.println("また、３で割り切れるときは数値の横にFizzを、５で割り切れるときは数値の横にBuzzを表示しなさい。");

		for (int i = 1; i <= x; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " Fizz Buzz");
			} else if (i % 3 == 0) {
				System.out.println(i + " Fizz");
			} else if (i % 5 == 0) {
				System.out.println(i + " Buzz");
			} else {
				System.out.println(i);
			}

		}

	}

}
