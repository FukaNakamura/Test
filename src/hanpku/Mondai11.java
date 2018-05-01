package hanpku;

public class Mondai11 {

	public static void main(String[] args) {

		String[] a = {"5", "23", "a", "89", "b", "c"};

		Mondai11 m = new Mondai11();
		int[] b = m.makeArray1(a);

		for(int i : b) {
			System.out.print(i + " ");
		}

		System.out.println();

		Mondai11 mm = new Mondai11();
		int[] c = mm.makeArray2(a);

		for(int i : c) {
			System.out.print(i + " ");
		}

		System.out.println();

		Mondai11 mmm = new Mondai11();
		int[] d = mmm.makeArray3(a);

		for(int i : d) {
			System.out.print(i + " ");
		}
	}



	int[] makeArray1(String[] a) {

		int b[] = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			try {
				b[i] = Integer.parseInt(a[i]);
			} catch(NumberFormatException e) {

			}
		}
		return b;
	}

	int[] makeArray2(String[] a) {

		int c[] = new int[a.length];

		try {
			for(int i = 0; i < a.length; i++) {
				c[i] = Integer.parseInt(a[i]);
			}
		} catch(NumberFormatException e) {

		}
		return c;
	}

	int[] makeArray3(String[] a) {

		int d[] = new int[a.length];

		try {
			for(int i = 0; i < a.length; i++) {
				d[i] = Integer.parseInt(a[i]);
			}
			return d;
		} catch(NumberFormatException e) {
			return new int[a.length];
		}
	}

}