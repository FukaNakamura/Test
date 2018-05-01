package kadai;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Kadai45 {

	public static void main(String[] args) {

		Scanner scn = new Scanner (System.in);

		System.out.print("要素数："); //要素数設定
		int youso = scn.nextInt();

		ArrayList<Integer> a = new ArrayList<>(youso); //要素数分の箱作りました

		for(int i = 0; i < youso; i++) {
			//配列にランダムな数字１～１０を格納
			int x = new Random().nextInt(10)+1;
			a.add(x);
		}

		//ここからネストで＊を表示させる地獄が始まる…
		for (int s = 0; s < 10; s++) { //縦の1~10

			for (int j = youso; 0 < j; j--) { //横のやつ、要素文
				int k = (s + 1) * (j + 1);
				if(k == 10) {
					System.out.print("＊"); //条件満たしたとき
				} else {
					System.out.print("　"); //満たしてないとき
				}
			}
			System.out.println(); //ここで最初のforの改行部分
		}

//横作るーぷ（内側
//縦（外側



//		＊を表示させる↓
//		並ばせる？↓



		scn.close();
	}

}
