package kadai;

public class Mondai11 {

	public static void main(String[] args) {

		//ベース
		String[] a = {"5", "23", "a", "89", "a", "a"};

		//配列内の文字をintに変える

		Mondai11 hrt1 = new Mondai11();
		int[] b = hrt1.makeArray1(a);

		for(int i : b) {
			System.out.print(i + " ");
		}

		System.out.println();

		Mondai11 hrt2 = new Mondai11();
		int[] c = hrt2.makeArray2(a);

		for(int i : c) {
			System.out.print(i + " ");
		}

		System.out.println();

		Mondai11 hrt3 = new Mondai11();
		int[] d = hrt3.makeArray3(a);

		for(int i : d) {
			System.out.print(i + " ");
		}

	}

	//★intに変換できない要素はゼロにする
	//入力フォームに未記入だった箇所がある場合に全部表示してくれるのがこっち

	int[] makeArray1(String[] a) {
		int[] b = new int[a.length];

		for(int i = 0; i < a.length; i++) {

			try {
				b[i] = Integer.parseInt(a[i]);
			} catch(NumberFormatException ne) {

			}
		}
		return b;
	}

	//★intに変換できない要素以降はゼロにする
	//入力フォームに未記入だった箇所があるつど表示してくれるのはこっち

	int[] makeArray2(String[] a) {
		int[] c = new int[a.length];
		try {
			for(int i = 0; i < a.length; i++) {
				c[i] = Integer.parseInt(a[i]);
			}
		} catch(NumberFormatException fe) {

		}
		return c;
	}

	//ALL 0

	int[] makeArray3(String[] a) {
		int[] d = new int[a.length];
		try {
			for(int i = 0; i < a.length; i++) {
				d[i] = Integer.parseInt(a[i]);
			}
			return d;
		} catch(NumberFormatException ee) {
			return new int[a.length];
		}
	}


}
