package tsd;

public class Sample3_9 {

	public static void main(String[] args) {

		for (int i = 0; i < 9; i++) { //縦の１～９

			for (int j = 0; j < 9; j++) { //横のやつ
				int k = (i + 1) * (j + 1);
				if(k < 10) {
					System.out.print("　" + k); //１ケタ用
				} else {
					System.out.print(" " + k); //２ケタ用
				}
			}
			System.out.println(); //ここで最初のforの改行部分
		}
	}
}
