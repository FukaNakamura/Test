package tsd;

public class Sample3_3 {
//if文
	public static void main(String args[]) {
		int x = 85;

		if (x == 100) {
			System.out.println("満点です！");
		} else if (x >= 80) {
			System.out.println("合格です。");
		} else if (x >= 60) { //「x < 80 && 」は不要
			System.out.println("がんばりました。");
		} else {
			System.out.println("もっと頑張りましょう。");
		}
	}

}
