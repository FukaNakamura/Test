package kadai;

public class Kadai13 {
//intに変換しようとしたときにエラーを流すようにする（もとはintでは作らない
	public static void main(String[] arge) {
		int x = 0;

		System.out.println("０～７の数字を入力してください。対応した曜日を表示します。：" + x);

		switch (x) {
		case 0:
			System.out.println("日曜日");
			break;
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		case 7:
			System.out.println("日曜日");
			break;
		}

	}

}
