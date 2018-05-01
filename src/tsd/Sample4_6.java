package tsd;

public class Sample4_6 {

	public static void main(String[] args) {
//		コマンドライン引数（実行時引数）全角スペースで区切ってもOK

//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);

		for(String sr : args) {
			System.out.println(sr);
		}

	}

}
